package ma.attijari.bank.com.WebApp.model.service.facade;

import java.util.List;

import ma.attijari.bank.com.WebApp.bean.Personne;

public interface PersonneService {

	public int deletePersonne(Personne personne);
	
	public Personne savePersonne(Personne personne);
	
	public List<Personne> displayAllInfo();
	
	
}
