package sn.app.ebank.entity;

import java.util.Date;
import java.util.List;

public class Compte {
    private String id;
    private String numero;
    private double solde;
    private Date dateCreation;
    private Date dateDerniereOperation;
    private boolean estActif;
    private String typeCompte; 
    private Utilisateur proprietaire;
    private List<Transaction> transactions;


    public Compte() {
        super();
    }


    public Compte(String id, String numero, double solde, Date dateCreation, Date dateDerniereOperation, 
                 boolean estActif, String typeCompte, Utilisateur proprietaire, List<Transaction> transactions) {
        super();
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.dateDerniereOperation = dateDerniereOperation;
        this.estActif = estActif; 
        this.typeCompte = typeCompte;
        this.proprietaire = proprietaire;
        this.transactions = transactions;
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDerniereOperation() {
        return dateDerniereOperation;
    }

    public void setDateDerniereOperation(Date dateDerniereOperation) {
        this.dateDerniereOperation = dateDerniereOperation;
    }

    public boolean isEstActif() {
        return estActif;
    }

    public void setEstActif(boolean estActif) {
        this.estActif = estActif;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public Utilisateur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Utilisateur proprietaire) {
        this.proprietaire = proprietaire;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    // Méthodes métier
    public void debiter(double montant) {
        if (montant > 0 && this.solde >= montant) {
            this.solde -= montant;
            this.dateDerniereOperation = new Date();
        }
    }

    public void crediter(double montant) {
        if (montant > 0) {
            this.solde += montant;
            this.dateDerniereOperation = new Date();
        }
    }

    public boolean transferer(Compte destinataire, double montant) {
        if (montant > 0 && this.solde >= montant && destinataire != null) {
            this.debiter(montant);
            destinataire.crediter(montant);
            return true;
        }
        return false;
    }
}
