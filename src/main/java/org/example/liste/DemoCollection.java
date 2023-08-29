package org.example.liste;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {

//*******************VECTOR******************************************
        System.out.println();
        System.out.println("*******************VECTOR******************************************");
        Vector<String> vector1 = new Vector<>();

        vector1.add("fruit");
        vector1.add("legume");
        vector1.add("epices");

        System.out.println("Vector " + vector1);
        System.out.println("Taille du vector : " +vector1.size());
        System.out.println("Element à l'index 1 : " + vector1.get(1));
        System.out.println("L'element contient-il epices : " + vector1.contains("epices"));
        System.out.println();
        System.out.println("*******************SORTEDSET******************************************");
        System.out.println();



//*******************SORTEDSET******************************************

        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("bleu");
        sortedSet.add("rouge");
        sortedSet.add("vert");
        sortedSet.add("gris");

        System.out.println("sortedSet : " +sortedSet);
        System.out.println("premier element : " +sortedSet.first());
        System.out.println("dernier element : " +sortedSet.last());
        System.out.println();
        System.out.println("*******************LINKEDLIST******************************************");
        System.out.println();



//*******************LINKEDLIST******************************************

        LinkedList<Double> linkedList = new LinkedList<>();

        linkedList.add(3.14);
        linkedList.add(86.18);
        linkedList.add(13.11);

        System.out.println("Premier element : " + linkedList.getFirst());
        System.out.println("Dernier element : " + linkedList.getLast());
        System.out.println(linkedList);
        System.out.println();

        linkedList.remove(1);

        System.out.println(linkedList);

        System.out.println();
        System.out.println("*******************SORTEDMAP******************************************");
        System.out.println();



//*******************SORTEDMAP******************************************

        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        sortedMap.put("voiture",5);
        sortedMap.put("bateau",20);
        sortedMap.put("avion",30);
        sortedMap.put("velo",50);

        System.out.println("SortedMap : " + sortedMap);
        System.out.println("1. Clés de sortedMap : "+ sortedMap.keySet() );
        System.out.println("2. Valeurs de sortedMap : "+ sortedMap.values() );

        System.out.println();
        System.out.println("*******************HASHMAP******************************************");
        System.out.println();



//*******************HASHMAP******************************************

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("walter", 50);
        hashMap.put("skyler", 45);
        hashMap.put("hank", 53);
        hashMap.put("jessee", 30);

        System.out.println("HashMap : " + hashMap);

        String csharp ="mike";
        int valueCSharp = 60;

        hashMap.put(csharp,valueCSharp);
        System.out.println(csharp.hashCode());
        System.out.println();

        System.out.println("taille hashMap : " +hashMap.size());
        System.out.println("2. Valeur associé a la clé 'Java' : " +hashMap.get("Java"));
        System.out.println("3. Verification si clé 'Banana' presente  : " +hashMap.containsKey("meth"));
        System.out.println();

        System.out.println("suppression de skyler");
        hashMap.remove("skyler");
        System.out.println("nouvelle hashMap : " + hashMap );




    }
}
