package ma.attijari.bank.com.WebApp.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fullname;
	private String cin;
	/*
	 * @ManyToOne private Adresse adresse;
	 * 
	 * @OneToOne private Account account;
	 */
	
	
	public Personne() {
		super();
	}

	public Personne(Long id, String fullname, String cin /*Adresse adresse, Account account*/) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.cin = cin;
		/*
		 * this.adresse = adresse; this.account = account;
		 */
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}

	/*
	 * public Adresse getAdresse() { return adresse; } public void
	 * setAdresse(Adresse adresse) { this.adresse = adresse; } public Account
	 * getAccount() { return account; } public void setAccount(Account account) {
	 * this.account = account; }
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", fullname=" + fullname + ", cin=" + cin
				+ ", adresse=" /*
								 * + adresse + ", account=" + account
								 */+ "]";
	}
	

	
}
