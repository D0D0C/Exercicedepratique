package org.example.Exercices.film;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

            Film film = new Film("Pulp fiction", "Tarantino", LocalDate.of(1995,5,31),"Cool");
            Film film1 = new Film("Fargo", "cohen", LocalDate.of(1996,8,12),"TropCool");
            Film film2 = new Film("BreakingBad", "Thoms", LocalDate.of(2005,8,12),"TropCool!");
            System.out.println();

            film.afficher();
            film1.afficher();
            film2.afficher();
            System.out.println();

            film.afficher();
            film1.afficher();
            film2.afficher();
            System.out.println();

    }

}
