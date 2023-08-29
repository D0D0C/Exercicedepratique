package org.example.statiqueMaison;

public class Maison {

    private String Name;
    private String couleur;
    private int nbPortes;
    private double largeur;
    private double longueur;

    private static int nbMaisons;
    public static String  nomLatin = "Domus";

    public Maison(String couleur, int nbPortes, double largeur, double longueur) {
        nbMaisons++;
        this.couleur = couleur;
        this.nbPortes = nbPortes;
        this.largeur = largeur;
        this.longueur = longueur;

    }
    public Maison(String name, String couleur, int nbPortes) {
        nbMaisons++;
        Name = name;
        this.couleur = couleur;
        this.nbPortes = nbPortes;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public static int getNbMaisons() {
        return nbMaisons;
    }

    public static void setNbMaisons(int nbMaisons) {
        Maison.nbMaisons = nbMaisons;
    }

    public static String getNomLatin() {
        return nomLatin;
    }

    public static void setNomLatin(String nomLatin) {
        Maison.nomLatin = nomLatin;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Maison " + Name +
                ", couleur='" + couleur + '\'' +
                ", nbPortes=" + nbPortes +
                ", largeur=" + largeur +
                ", longueur=" + longueur +
                '}';
    }
}


