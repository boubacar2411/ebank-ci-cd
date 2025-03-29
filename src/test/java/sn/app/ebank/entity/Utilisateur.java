package sn.app.ebank.entity;

import java.util.List;

public class Utilisateur {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String telephone;
    private String adresse;
    private boolean estActif;
    private List<Compte> comptes;

    public Utilisateur() {
        super();
    }

    public Utilisateur(String id, String nom, String prenom, String email, String motDePasse, String telephone, String adresse, boolean estActif, List<Compte> comptes) {
        super();    
        this.id = id;       
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.telephone = telephone;
        this.adresse = adresse;
        this.estActif = estActif;
        this.comptes = comptes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }           

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
