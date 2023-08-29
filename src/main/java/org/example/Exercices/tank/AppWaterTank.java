package org.example.Exercices.tank;

public class AppWaterTank {
    public static void main(String[] args) {

        WaterTank waterTank1 = new WaterTank(500,150,50);
        WaterTank waterTank2 = new WaterTank(400,100,40);

        System.out.println("WaterTank1 poids total = " + waterTank1.poidTotal() );
        System.out.println("WaterTank2 poids total = " + waterTank2.poidTotal() );
        System.out.println();

        waterTank1.remplir(50);
        waterTank2.vider(20);

        System.out.println("WaterTank1 poids total = " + waterTank1.poidTotal() );
        System.out.println("WaterTank2 poids total = " + waterTank2.poidTotal() );
        System.out.println();

        System.out.println("Le volume du watertank1 est : " + waterTank1.getVolume());
        System.out.println("Le volume du watertank2 est : " + waterTank2.getVolume());
        System.out.println();

        System.out.println("le Volume total est : " + WaterTank.volumeTotal);

        waterTank1.remplir(50);
        waterTank2.remplir(80);

        System.out.println("Le volume du watertank1 est : " + waterTank1.getVolume());
        System.out.println("Le volume du watertank2 est : " + waterTank2.getVolume());
        System.out.println();





    }
}
