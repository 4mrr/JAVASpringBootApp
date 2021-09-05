package ma.attijari.bank.com.WebApp.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String rib;
	@ManyToOne	
	private Bank bank;
	@OneToOne
	private Personne personne;
    private Date dateDeCreation;
    private Boolean status;
    private Double solde;
    
	
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	
	
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Account(Long id, String rib, Bank bank, Double solde, Personne personne,
			Date dateDeCreation, Boolean status) {
		super();
		this.id = id;
		this.rib = rib;
		this.bank = bank;
		this.solde = solde;
		this.personne = personne;
		this.dateDeCreation = dateDeCreation;
		this.status = status;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", rib=" + rib + ", bank=" + bank + ", solde=" + solde
				+ ", personne=" + personne + ", dateDeCreation=" + dateDeCreation + ", status=" + status + "]";
	}

    
    
     
	
	
}
