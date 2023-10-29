package Ds2019;

import java.util.Locale;
import java.util.Objects;

public class Lettre extends Courrier {
    private double poids;
    private String format;


    public Lettre(boolean mode_dexpedition, String adresse,double poids,String format) {
        super(mode_dexpedition, adresse);
        this.poids=poids;
        if (format.toUpperCase().equals("A3")||format.toUpperCase().equals("A4")){
            this.format=format.toUpperCase();
        }
        else{
            System.out.println("le format est invalide");
            this.format="A3";
        }
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println(
                "poids=" + poids +
                        ", format='" + format + '\'' +
                        " } " );
    }
    @Override
    public double affranchir(){
        double montant=0;
        if(Objects.equals(format, "A3")){
            montant=3.50+tarif*poids/1000;
        }
        else if(Objects.equals(format, "A4")){
            montant=2.50+tarif*poids/1000;
        }
        return montant;
    }


}
