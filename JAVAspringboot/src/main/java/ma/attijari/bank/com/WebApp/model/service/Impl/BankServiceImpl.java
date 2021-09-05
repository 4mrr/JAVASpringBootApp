package ma.attijari.bank.com.WebApp.model.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.attijari.bank.com.WebApp.bean.Bank;
import ma.attijari.bank.com.WebApp.model.dao.BankDao;

@Service
public class BankServiceImpl {

	@Autowired
	BankDao bankDao;

	public Bank saveBank(Bank bank) { 
		return bankDao.save(bank);
	}
	
	public List<Bank> findAll()
	{
		return bankDao.findAll();
	}
}
