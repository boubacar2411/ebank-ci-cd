package sn.app.ebank.entity;

import java.util.Date;
import sn.app.ebank.enums.TransactionEnum;

public class Transaction {
    private String id;
    private double montant;
    private Date dateTransaction;
    private TransactionEnum type;
    private String description;
    private Compte compteSource;
    private Compte compteDestination; // Peut être null pour les opérations simples

    // Constructeur par défaut
    public Transaction() {
        super();
    }

    // Constructeur avec paramètres
    public Transaction(String id, double montant, Date dateTransaction, TransactionEnum type, 
                      String description, Compte compteSource, Compte compteDestination) {
        super();
        this.id = id;
        this.montant = montant;
        this.dateTransaction = dateTransaction;
        this.type = type;
        this.description = description;
        this.compteSource = compteSource;
        this.compteDestination = compteDestination;
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public TransactionEnum getType() {
        return type;
    }

    public void setType(TransactionEnum type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Compte getCompteSource() {
        return compteSource;
    }

    public void setCompteSource(Compte compteSource) {
        this.compteSource = compteSource;
    }

    public Compte getCompteDestination() {
        return compteDestination;
    }

    public void setCompteDestination(Compte compteDestination) {
        this.compteDestination = compteDestination;
    }
} 