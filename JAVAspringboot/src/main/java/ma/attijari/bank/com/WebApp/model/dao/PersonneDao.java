package ma.attijari.bank.com.WebApp.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.attijari.bank.com.WebApp.bean.Personne;

@Repository
public interface PersonneDao extends JpaRepository<Personne, Long> {
	
	public Personne  findByCin(String cin);
	
	public Personne findByFullname(String fullname);
	
	public List<Personne> findAll();
	
	
	


}
