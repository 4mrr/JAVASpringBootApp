package ma.attijari.bank.com.WebApp.model.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.attijari.bank.com.WebApp.bean.Account;
import ma.attijari.bank.com.WebApp.bean.Bank;
import ma.attijari.bank.com.WebApp.model.dao.AccountDao;
import ma.attijari.bank.com.WebApp.model.dao.BankDao;
import ma.attijari.bank.com.WebApp.model.service.facade.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao accountDao;
	@Autowired
	BankDao bankDao;
	
	@Override
	public int transferer(String ribSource,String ribDestinataire, Double montant) {
		
		Account accSource = accountDao.findByRib(ribSource);
		Account accDestinataire = accountDao.findByRib(ribDestinataire);
		
		Bank bank =accSource.getBank(); 
		if(accSource.getStatus()==true && accDestinataire.getStatus() ==true) 
		{
		 if(accSource.getBank().getNomAgence()!=accDestinataire.getBank().getNomAgence()) 
		{
			if(accSource.getRib()!=accDestinataire.getRib()) 
			{
				if(accSource.getSolde() >= montant + accSource.getBank().getTtc()) 
				{
					accSource.setSolde(accSource.getSolde() - montant - accSource.getBank().getTtc());
					bank.setCaisse(accSource.getBank().getCaisse() + accSource.getBank().getTtc());
					accSource.setBank(bank);
					bankDao.save(bank);
				    accountDao.save(accSource);
				    
					accDestinataire.setSolde(accDestinataire.getSolde() + montant);
					accountDao.save(accDestinataire);
	
					return 1;
				}
				return -1;
			}
			return -2;
	}else 
	{
		if(accSource.getRib()!=null && accDestinataire.getRib()!=null) 
		{
			if(accSource.getRib()!=accDestinataire.getRib()) 
			{
				if(accSource.getSolde() >= montant ) 
				{
					accSource.setSolde(accSource.getSolde() - montant);
				    accountDao.save(accSource);
					accDestinataire.setSolde(accDestinataire.getSolde() + montant);
					accountDao.save(accDestinataire);
					return 1;
				}
				return -1;
			}
			return -3;
		}
		return -4;
	}
		}else 
		{
			return 404;	
		}
		 
	}

	@Override
	public int debiter(String rib,Double montant) {
		Account account =accountDao.findByRib(rib);
		Bank bank = account.getBank();
		if(account.getRib()!=null && account.getStatus()!=false) 
		{
			if(account.getSolde() >= montant) 
			{
				account.setSolde(account.getSolde() - montant);
				accountDao.save(account);
				bank.setCaisse(account.getBank().getCaisse() + montant);
				bankDao.save(bank);
				return 1;
			}
			return -1;
		}
		return -2;
	}

    @Override
	public int crediter(String rib,Double montant) {
    	Account account = accountDao.findByRib(rib);
    	Bank bank = account.getBank();
    	if(account.getRib()!=null && account.getStatus()!=false) 
		{
    	 
    	 bank.setCaisse(account.getBank().getCaisse()-montant);
		 bankDao.save(bank);
    	 account.setSolde(account.getSolde() + montant);	
		 accountDao.save(account);	
		 return 1;	
		}
		return -1;
    }
    
    @Transactional
	@Override
	public int deleteAccouontByRib(String rib) {
		Account account = accountDao.findByRib(rib);
    	if(account!=null) 
    	{
    		accountDao.delete(account);
    		return 1;
    	}else 
    	{
    		return -1;	
    	}
	}

	@Override
	public List<Account> isOuvert() {
		
		return accountDao.findByStatus(true);
	}

	@Override
	public Account saveAcc(Account account) {
		return accountDao.save(account);
	}

	
}
