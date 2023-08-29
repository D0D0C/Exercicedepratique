package org.example.Exercices.joueur;

public class Joueur {
    private String name;
    private int level;
    private int xp;


    public Joueur(String name) {
        this.name = name;
        this.level = 1;
        this.xp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", xp=" + xp +
                '}';
    }

    public void effecteurQuete (){
        this.xp +=10;
        levelUp();
    }

    public void levelUp(){
        if (this.xp >= 100){
            xp +=1;
            level++;
            xp=0;
            System.out.printf("Le joueur: %s passe au niveau %d !\n",name, level);
        }
    }
}

