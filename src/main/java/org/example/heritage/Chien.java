package org.example.heritage;

public class Chien extends Animal {

    private double taille;

    public Chien (String nom, int age, String couleur, double taille){
        super(nom, age, couleur);
        this.taille = taille;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    @Override
    public void crier() {
        System.out.println("wouf");
    }

    @Override
    public void manger() {
        super.manger();
        System.out.println("des nonos");
    }

    @Override
    public String toString() {
        return "Nom du chien : " + getNom() + " Age du chat : " + getAge() + " année de naissance : " + anneeNaissance();
    }
}
