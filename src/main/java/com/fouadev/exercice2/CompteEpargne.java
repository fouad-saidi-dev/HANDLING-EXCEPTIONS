package com.fouadev.exercice2;

public class CompteEpargne extends CompteBancaire{
    private double interet;
    public CompteEpargne(String nemeroCompte, double solde, String titulaire,double interet) {
        super(nemeroCompte, solde, titulaire);
        this.interet=interet;
    }
}
