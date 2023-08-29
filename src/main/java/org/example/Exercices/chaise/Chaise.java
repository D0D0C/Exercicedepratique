package org.example.Exercices.chaise;

public class Chaise {

    private int nbPieds;

    private String materiaux;
    private String couleur;

    public Chaise(int nbPieds, String materiaux, String couleur) {
        this.nbPieds = nbPieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
    }

    public int getNbPieds() {
        return nbPieds;
    }

    public void setNbPieds(int nbPieds) {
        this.nbPieds = nbPieds;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Je suis une chaise avec " +
                 + nbPieds + " pieds en "
                 + materiaux + " et de couleur " +
                 couleur;
    }

    public void afficher(){
        System.out.println(this.toString());
    }
}
