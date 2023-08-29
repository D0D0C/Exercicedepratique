package org.example.Exercices.joueur;

public class Main {
    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("Dorian");



        for (int compteur = 1; compteur < 21; compteur++) {
            System.out.println("Le joueur effectue la quête n° " + compteur);
            joueur1.effecteurQuete();

        }
    }
}
