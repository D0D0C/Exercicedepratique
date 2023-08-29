package org.example.classeAbstraite;

import org.example.classeAbstraite.Animal;
import org.example.classeAbstraite.Chat;
import org.example.classeAbstraite.Chien;
public class MainAbstraite {
    public static void main(String[] args) {

        Chat chat1 = new Chat("Felix", 8, "blanc");
        chat1.crier(); // Methode abstraite de Animal (ne peut être instanciée)
        chat1.manger(); //Methode instanciée dans la classe chat
        System.out.println();

        Chien chien1 = new Chien("medor",5,"gris");
        chien1.crier(); // Methode abstraite de Animal (ne peut être instanciée)
        chien1.manger(); //Methode instanciée dans la classe chien

    }
}
