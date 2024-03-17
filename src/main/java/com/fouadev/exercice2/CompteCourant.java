package com.fouadev.exercice2;

public class CompteCourant extends CompteBancaire{

    private double decouvertAutorise;
    public CompteCourant(String nemeroCompte, double solde, String titulaire,double decouvertAutorise) {
        super(nemeroCompte, solde, titulaire);
        this.decouvertAutorise=decouvertAutorise;
    }
}
