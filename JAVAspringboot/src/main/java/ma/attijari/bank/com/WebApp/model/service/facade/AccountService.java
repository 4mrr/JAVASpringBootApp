package ma.attijari.bank.com.WebApp.model.service.facade;

import java.util.List;

import javax.transaction.Transactional;

import ma.attijari.bank.com.WebApp.bean.Account;

public interface AccountService {

	
	public int transferer(String ribSource,String ribDestinataire,Double montant);
	
	public int debiter(String rib,Double montant);
	
	public int crediter(String rib,Double montant);
	
	@Transactional
	public int deleteAccouontByRib(String rib);

	public List<Account> isOuvert();
	
	public Account saveAcc(Account account);
	 
}
