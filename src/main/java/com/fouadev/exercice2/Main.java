package com.fouadev.exercice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SoldeInsuffisantException {

        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        comptes.add(new CompteEpargne("0000",12000,"client1",500));
        comptes.add(new CompteCourant("1111",10000,"client2",400));
        comptes.add(new CompteEpargne("2222",15000,"client3",200));
        comptes.add(new CompteCourant("3333",18000,"client4",100));

        // afficher le solde de tout les comptes
        for (CompteBancaire compte : comptes) {
            compte.afficherSolde();
        }

        // supprimer un compte par son index
        comptes.remove(0);

        System.out.println("****************");
        for (CompteBancaire compte : comptes) {
            compte.afficherSolde();
        }

        //retirer
        System.out.println("****************");
        try{
            comptes.get(1).retirer(100);
            System.out.print("Solde devient apres retire 100: ");
            comptes.get(1).afficherSolde();
        } catch (SoldeInsuffisantException e) {
            System.out.println("Error: "+e.getMessage());
        }

        //deposer
        System.out.println("****************");
        comptes.get(2).depot(7000);
        System.out.print("Solde devient apres depot 7000: ");
        comptes.get(2).afficherSolde();


        System.out.println("****************");
        try {
            comptes.get(0).transfere(comptes.get(1),1000);
            System.out.print("Solde devient apres le transfere : ");
            comptes.get(0).afficherSolde();
            System.out.print("Solde du compte apres recevoir un montant: ");
            comptes.get(1).afficherSolde();
        }catch (SoldeInsuffisantException e) {
            System.out.println("Error: "+e.getMessage());
        }



    }
}
