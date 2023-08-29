package org.example.Exercices.biblio;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private List<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<>();
    }

    public void addLivre(Livre livre) {
        livres.add(livre);
    }

    public void removeLivre(Livre livre) {
        livres.remove(livre);
    }

    public void afficherLivres() {
        for (int i = 0; i < livres.size(); i++) {
            System.out.println((i + 1) + ") " + livres.get(i).toString());
        }
    }

    public void emprunter(Livre livre) {
        if (livre.isStatus() == false) {
            if (!livre.isStatus()) {
                livre.emprunte();
            }
        }
    }
    public void rendre(Livre livre) {
         if (!livre.isStatus()) {
                livre.emprunte();
            }
        }
    }


