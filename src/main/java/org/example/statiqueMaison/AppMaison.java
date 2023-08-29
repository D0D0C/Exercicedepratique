package org.example.statiqueMaison;

public class AppMaison {
    public static void main(String[] args) {

        Maison maison1 = new Maison("DUDU","Blanche",3);

        System.out.println(maison1.toString());

        Maison maison2 = new Maison("DIDI",2,10.10,12.12);
        System.out.println(maison2.toString());

        Maison maison3 = new Maison("Dodo", "vert",10);

        System.out.println(maison3.toString());

        System.out.println("Le nombre de maison est " + Maison.getNbMaisons());

    }
}
