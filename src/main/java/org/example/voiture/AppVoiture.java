package org.example.voiture;

public class AppVoiture {
    public static void main(String[] args) {

        Voiture BMW = new Voiture("rouge", 50,120);
        Voiture AUDI = new Voiture("noir",40,133,"AUDI",3);

        System.out.println(BMW.toString());
        System.out.println(AUDI.toString());

        BMW.remplirReservoir(15);
        System.out.println(AUDI.chevauxFiscaux());
        System.out.println(BMW.carburant);

        BMW.carburant += 1;
        System.out.println(BMW.carburant);

        System.out.println(BMW.chevauxFiscaux());

        double chevauxFiscaux = AUDI.chevauxFiscaux();

        System.out.println(chevauxFiscaux);


        }
}
