package org.example.Exercices.biblio;

public class Livre {

    private String titre;
    private String auteur;
    private int nbPage;
    private boolean status = false;

    public Livre(String titre, String auteur, int nbPage, boolean status) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPage = nbPage;
        this.status = status;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPage=" + nbPage +
                ", status=" + status +
                '}';
    }
    public void emprunte() {
        this.status =! status;
        }
    }

