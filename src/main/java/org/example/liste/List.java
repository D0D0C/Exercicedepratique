package org.example.liste;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> prenoms;
        prenoms = new ArrayList<String>();

        prenoms.add("Dorian");
        prenoms.add("Toto");
        prenoms.add("Tutu");

        System.out.println(prenoms.get(2));

        prenoms.set(2, "Dudu");
        System.out.println();

        System.out.println(prenoms.get(2));
        System.out.println();

        System.out.println("taille :" + prenoms.size());
        System.out.println();

        prenoms.add("Tata");

        System.out.println(prenoms.get(3));

        prenoms.remove(2);

        System.out.println(prenoms.get(2));

        for (String prenom : prenoms) {
            System.out.println(prenom);
            System.out.println();


            for (int i = 0; i < prenoms.size(); i++) {
                System.out.println(prenoms.get(i));
            }
        }
    }
}