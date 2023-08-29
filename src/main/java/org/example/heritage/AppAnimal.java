package org.example.heritage;

import org.example.heritage.Animal;
import org.example.heritage.Chat;
import org.example.heritage.Chien;
public class AppAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal("medor", 5,"marron");
        animal1.crier();
        System.out.println();

        Chien chien = new Chien("doudou",3,"gris", 50.23);
        chien.crier();
        chien.manger();
        System.out.println();

        Chat chat = new Chat("felix",8,"blanc", 7);
        Chat chat1 = new Chat("zz",3,"brun", 7);
        chat.crier();
        chat.manger();
        System.out.println();

        System.out.println(animal1);
        System.out.println();
        System.out.println(chien);
        System.out.println();
        System.out.println(chat);
        System.out.println();
        System.out.println(chat1);

    }


}
