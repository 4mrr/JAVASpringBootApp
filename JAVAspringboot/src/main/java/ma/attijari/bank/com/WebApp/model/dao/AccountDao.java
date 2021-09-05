package ma.attijari.bank.com.WebApp.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.attijari.bank.com.WebApp.bean.Account;
import ma.attijari.bank.com.WebApp.bean.Bank;
import ma.attijari.bank.com.WebApp.bean.Personne;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {

	public Account findByRib(String rib);
	
	public Account findByPersonne(Personne personne);
	
	public List<Account> findAll(); 

	public Account  findByBankNomAgence(String nomAgence);
	
	public List<Account> findByBank(Bank bank);
	
	public List<Account> findByStatus(Boolean status);

}
