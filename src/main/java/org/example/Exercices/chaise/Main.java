package org.example.Exercices.chaise;

public class Main {
    public static void main(String[] args) {

        Chaise chaiseBois = new Chaise(4,"bois","grise");
        Chaise tabouretMetal = new Chaise(3,"metal","taupe");
        Chaise chaisePlastique = new Chaise(5,"plastique","blanc");


        System.out.println(chaiseBois);
        System.out.println(tabouretMetal);
        System.out.println(chaisePlastique);
        System.out.println();

        chaiseBois.afficher();
        tabouretMetal.afficher();
        chaisePlastique.afficher();


    }
}
