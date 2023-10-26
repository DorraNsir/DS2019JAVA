package Ds2019;

public class Colis extends Courrier {
    private double poids;
    private double volume;

    public Colis(boolean mode_dexpedition, String adresse, double poids, double volume) {
        super(mode_dexpedition, adresse);
        this.poids = poids;
        this.volume = volume;
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println(
                "poids=" + poids +
                ", volume=" + volume +
                '}');
    }

    @Override
    public double affranchir() {
        double montant= super.affranchir();
        return montant+=0.25*volume+poids/10000*0.1;


    }

}
