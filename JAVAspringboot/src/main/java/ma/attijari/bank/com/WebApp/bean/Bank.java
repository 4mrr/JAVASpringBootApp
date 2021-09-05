package ma.attijari.bank.com.WebApp.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomAgence;
	private Double gain;
	private Double caisse;
	private Double ttc;
	
	
	
	
	public Double getCaisse() {
		return caisse;
	}
	public void setCaisse(Double caisse) {
		this.caisse = caisse;
	}
	public Double getTtc() {
		return ttc;
	}
	public void setTtc(Double ttc) {
		this.ttc = ttc;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getGain() {
		return gain;
	}
	public void setGain(Double gain) {
		this.gain = gain;
	}
	
	
	public Bank(Long id, String nomAgence, Double gain, Double caisse, Double ttc) {
		super();
		this.id = id;
		this.nomAgence = nomAgence;
		this.gain = gain;
		this.caisse = caisse;
		this.ttc = ttc;
	}
	public Bank() {
		super();
	}
	
	
	
	
}
