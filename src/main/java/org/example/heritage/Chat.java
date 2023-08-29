package org.example.heritage;

public class Chat extends Animal {

    private int vies;

    public Chat(String nom, int age, String couleur, int vies) {
        super(nom, age, couleur);
        this.vies = 7;
    }

    public int getVies() {
        return vies;
    }

    public void setVies(int vies) {
        this.vies = vies;
    }

    @Override
    public void crier() {
        System.out.println("miaou");
    }
    @Override
    public void manger() {
        super.manger();
        System.out.println("des croquette");
    }

    @Override
    public String toString() {
        return "Nom du chat : " + getNom() + " Age du chat : " + getAge() + " année de naissance : " + anneeNaissance();
    }
}