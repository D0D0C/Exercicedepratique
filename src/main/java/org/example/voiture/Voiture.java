package org.example.voiture;

public class Voiture {

    public String couleur;

    public int carburant;

    public int puissance;

    public String marque;

    public int nbPortes;


    public Voiture() {
        System.out.println("constructeur sans paramètre");
    }

    public Voiture(String couleur) {
        this.couleur = couleur;
        System.out.println("constructeur avec couleur");
    }

    public Voiture(String couleur, int carburant, int puissance) {
        this(couleur);
        this.carburant = carburant;
        this.puissance = puissance;
        System.out.println("constructeur avec 3 attributs (couleur, carburant, puissance)");
    }

    public Voiture(String couleur, int carburant, int puissance, String marque, int nbPortes) {
        this.couleur = couleur;
        this.carburant = carburant;
        this.puissance = puissance;
        this.marque = marque;
        this.nbPortes = nbPortes;
    }

    //*******Création des méthodes**************

    // Visibilité, type , retour

    public void demarrer(){
        System.out.println("La voiture démarre");
    }

    public void freiner() {
        System.out.println("la voiture freine");
    }
        public void remplirReservoir(int volume){
            carburant += volume;
        }

        public double chevauxFiscaux (){
            return puissance/7;
        }

    @Override
    public String toString() {
        return "Voiture{" +
                "couleur='" + couleur + '\'' +
                ", carburant=" + carburant +
                ", puissance=" + puissance +
                ", marque='" + marque + '\'' +
                ", nbPortes=" + nbPortes +
                '}';
    }

    public String afficherDetails() {
        return "Voiture :" +
                "couleur='" + couleur + '\'' +
                ", carburant=" + carburant +
                ", puissance=" + puissance +
                ", marque='" + marque + '\'' +
                ", nombrePortes=" + nbPortes +
                '.';
    }
}




