package org.example.classeAbstraite;

public abstract class Animal {

    protected String nom;
    protected int age;
    protected String couleur;

    public Animal(String nom, int age, String couleur) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
    }

    public abstract void crier();

    public void manger(){
        System.out.println("l'animal mange");
    }
}
