package ma.attijari.bank.com.WebApp.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import ma.attijari.bank.com.WebApp.bean.Bank;

@Repository
public interface BankDao extends  JpaRepository<Bank, Long> {

	public Bank findByGain(Double gain);
	
	public Bank findByTtc(Double Ttc);
	
	public Bank findByNomAgence(String nomAgence);
	
	public List<Bank> findAll();
	
	
}
