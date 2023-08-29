package org.example.boite;

public class AppBoite {
    public static void main(String[] args) {

        Boite<String> boite1 = new Boite<>("une pièce");

        String contenuString1 = boite1.getContenu();
        System.out.println("Le contenu de la boite est " + contenuString1);

        Boite<Double> boite2 = new Boite<>(3.14);
        Double contenuString2 = boite2.getContenu();
        System.out.println("Le contenu de la boite 2" + contenuString2);
    }
}
