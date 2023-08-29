package org.example.Exercices.tank;

public class WaterTank {

    private double poids;
    private double volumeMax;
    private double volume;
    public static double volumeTotal = 0;

    public WaterTank(double poids, double volumeMax, double volume) {
        this.poids = poids;
        this.volumeMax = volumeMax;
        this.volume = volume;
        WaterTank.volumeTotal += volume;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(double volumeMax) {
        this.volumeMax = volumeMax;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public static double getVolumeTotal() {
        return volumeTotal;
    }

    public static void setVolumeTotal(double volumeTotal) {
        WaterTank.volumeTotal = volumeTotal;
    }

    public void remplir(double volume) {
        if ((volume + this.volume) <= volumeMax) {
            this.volume += volume;
            WaterTank.volumeTotal += volume;
        }
    }

    public void vider(double volume) {
        if (this.volume >= volume) {
            this.volume -= volume;
            WaterTank.volumeTotal -= volume;
        }
    }

    public double poidTotal() {
        return poids + volume;
        }
    }

