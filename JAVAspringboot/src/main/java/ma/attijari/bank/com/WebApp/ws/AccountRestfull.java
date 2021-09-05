package ma.attijari.bank.com.WebApp.ws;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.attijari.bank.com.WebApp.bean.Account;
import ma.attijari.bank.com.WebApp.bean.Bank;
import ma.attijari.bank.com.WebApp.bean.Personne;
import ma.attijari.bank.com.WebApp.model.service.Impl.AccountServiceImpl;
import ma.attijari.bank.com.WebApp.model.service.Impl.BankServiceImpl;
import ma.attijari.bank.com.WebApp.model.service.Impl.PersonneServiceImpl;

@RestController
@RequestMapping("project/bank-api-aliae")
@Api("Gestion de la bank")
public class AccountRestfull {
	
	@Autowired
	PersonneServiceImpl personneServiceImpl;
    @Autowired
	AccountServiceImpl accountServiceImpl;
    @Autowired
    BankServiceImpl bankServiceImpl;
    
    @DeleteMapping("/delete/personne")
    @ApiOperation("Cette methode permet de supprimer un personne ")
	public int deletePersonne(@RequestBody Personne personne) {
		return personneServiceImpl.deletePersonne(personne);
	}
    @PostMapping("/save/personne")
    @ApiOperation("Cette methode permet d'enregistrer un personne ")
	public Personne savePersonne(@RequestBody Personne personne) {
		return personneServiceImpl.savePersonne(personne);
	}
    @GetMapping("/display/allPersonne")
    @ApiOperation("Cette methode permet d'afficher tout les personnes ")
	public List<Personne> displayAllInfo() {
		return personneServiceImpl.displayAllInfo();
	}
    @PutMapping("/transeferer/ribSource/{ribSource}/ribDestinataire/{ribDestinataire}/montant/{montant}")
    @ApiOperation("Cette methode permet de transferer un montant vers un account ")
	public int transferer(@PathVariable String ribSource,@PathVariable String ribDestinataire,@PathVariable Double montant) {
		return accountServiceImpl.transferer(ribSource, ribDestinataire, montant);
	}
    @PutMapping("/debiter/rib/{rib}/montant/{montant}")
    @ApiOperation("cette methode permet de debiter un montant from an account donne")
	public int debiter(@PathVariable String rib, @PathVariable Double montant) {
		return accountServiceImpl.debiter(rib, montant);
	}
    @PutMapping("/crediter/rib/{rib}/montant/{montant}")
    @ApiOperation("cette methode permet de crediter un montant from an account donne")
	public int crediter(@PathVariable String rib,@PathVariable Double montant) {
		return accountServiceImpl.crediter(rib, montant);
	}
    @DeleteMapping("/delete/account")
    @ApiOperation("cette methode permet de supprimer an account By son rib")
	public int deleteAccouontByRib(@PathVariable String rib) {
		return accountServiceImpl.deleteAccouontByRib(rib);
	}
    @GetMapping("/display/allAccountOuvert")
	@ApiOperation("Cette methode permet d'afficher all open accounts")
    public List<Account> isOuvert() {
		return accountServiceImpl.isOuvert();
	}
    @PostMapping("/save/accouont")
    @ApiOperation("Cette methode permet d'enregistrer an acc ")
	public Account saveAcc(@RequestBody Account account) {
		return accountServiceImpl.saveAcc(account);
	}
    @PostMapping("/save/bank")
    @ApiOperation("Cette methode permet d'enregistrer un bank ")
	public Bank saveBank(@RequestBody Bank bank) {
		return bankServiceImpl.saveBank(bank);
	}
    @GetMapping("/display/allBank")
	@ApiOperation("Cette methode permet d'afficher all bank")
	public List<Bank> findAll() {
		return bankServiceImpl.findAll();
	}
   
}
