package com.fouadev.exercice2;

public class CompteBancaire {
    private String nemeroCompte;
    private double solde;
    private String titulaire;

    public CompteBancaire(String nemeroCompte, double solde, String titulaire) {
        this.nemeroCompte = nemeroCompte;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public void depot(double montant) {
        solde+=montant;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {

        if (solde>montant) {
            solde-=montant;
        } else
            throw new SoldeInsuffisantException("Solde Insuffisant");
    }

    public void afficherSolde() {
        System.out.println("Solde du compte: "+solde);
    }

    public void transfere(CompteBancaire to,double montant) throws SoldeInsuffisantException {
        if (this.solde>montant) {
            to.solde += montant;
            this.solde -= montant;
        } else
            throw new SoldeInsuffisantException("Solde Insuffisants");
    }

}
