package ma.attijari.bank.com.WebApp.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Adresse implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Personne personne;
	private String ville;
	private String paye;
	private String street;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPaye() {
		return paye;
	}
	public void setPaye(String paye) {
		this.paye = paye;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Adresse(Long id, Personne personne, String ville, String paye, String street) {
		super();
		this.id = id;
		this.personne = personne;
		this.ville = ville;
		this.paye = paye;
		this.street = street;
	}
	public Adresse() {
		super();
	}
	
	
}
