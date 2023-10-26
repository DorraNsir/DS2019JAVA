package Ds2019;

public class Courrier {
    protected boolean mode_dexpedition;
    protected String adresse;
    protected final double tarif=0.5;

    public Courrier(boolean mode_dexpedition, String adresse) {
        this.mode_dexpedition = mode_dexpedition;
        this.adresse = adresse;
    }
    public boolean estValide(){
        return (adresse!=null && !adresse.isEmpty());
    }
    public void decrire(){
        System.out.print(this.getClass().getSimpleName()+" { mode_dexpedition= ");
               System.out.println(mode_dexpedition?"express":"normal" +
                ", adresse='" + adresse + '\'' +
                ", tarif=" + tarif +
                " } ");
    }
    public double affranchir(){
        double montant=0;
        if(estValide()){
            if(mode_dexpedition){
                montant=tarif*2;
            }
            else{
                montant=tarif;
            }

        }
        else{
            montant=0;
        }
        return montant;
    }



}


