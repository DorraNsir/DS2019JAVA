package Ds2019;

import java.util.Scanner;

public class BoiteCourrier {
    private Courrier[] courriers;
    private int n;
    private  int nb=0;

    public BoiteCourrier( int n) {
        this.courriers = new Courrier[n];
        this.n = n;

    }

    public  void setCourriers(Courrier c1) {
        if(nb<n) {
            this.courriers[nb] = c1;
            nb++;
        }
    }

    public double affranchir(){
        double montantTotal=0;
        for(int i=0;i<nb;i++){
            montantTotal+=courriers[i].affranchir();
        }
        return montantTotal;
 }
 public int courriersInvalides(){
        int nb=0;
     for(int i=0;i<n;i++){
         if (!courriers[i].estValide()){
             nb++;
         }
     }
     return nb;
 }
 public void afficher(){
     for(int i=0;i<n;i++){
        if(!courriers[i].estValide()){
            System.out.println("Ce courriers est invalide");

        }
         courriers[i].decrire();
     }
 }
}
