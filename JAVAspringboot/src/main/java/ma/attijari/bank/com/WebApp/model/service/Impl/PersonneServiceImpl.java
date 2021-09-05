package ma.attijari.bank.com.WebApp.model.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.attijari.bank.com.WebApp.bean.Personne;
import ma.attijari.bank.com.WebApp.model.dao.PersonneDao;
import ma.attijari.bank.com.WebApp.model.service.facade.PersonneService;

@Service
public class PersonneServiceImpl implements PersonneService {

	@Autowired
	PersonneDao personneDao;
	
	@Transactional
	@Override
	public int deletePersonne(Personne personne) {
		if(personne.getCin()!=null) 
		{
			personneDao.delete(personne);
			return 1;
		}
		return -1;
	}

	@Override
	public Personne savePersonne(Personne personne) {
		return	personneDao.save(personne);
	}
	@Override
	public List<Personne> displayAllInfo() {
		return personneDao.findAll();
	}


}
