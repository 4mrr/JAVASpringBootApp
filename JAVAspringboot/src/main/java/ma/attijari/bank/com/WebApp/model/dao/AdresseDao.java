package ma.attijari.bank.com.WebApp.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.attijari.bank.com.WebApp.bean.Adresse;

@Repository
public interface AdresseDao extends JpaRepository<Adresse, Long> {

	public List<Adresse> findByVille(String Ville);
	
	public List<Adresse> findByPaye(String paye);
	
    public Adresse findByStreet(String street);
	
    public List<Adresse> findAll();
}
