package Ds2019;

public class Main {
    public static void main(String[] args) {
        BoiteCourrier bc=new BoiteCourrier(3);
        Courrier c1=new Lettre(true,"",150,"A3");
        Courrier c2=new Lettre(false,"sousse",250,"");
        Courrier c3=new Colis(true,"nabeul",150,2);
        bc.setCourriers(c1);
        bc.setCourriers(c2);
        bc.setCourriers(c3);
        double a=bc.affranchir();
        System.out.println("le montant totale de tous les courriers = "+ a);
        int b=bc.courriersInvalides();
        System.out.println("le nombre de courriers invalides = "+ b);
        bc.afficher();

    }
}
