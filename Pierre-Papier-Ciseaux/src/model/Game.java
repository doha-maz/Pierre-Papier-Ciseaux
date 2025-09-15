package model;

import java.util.Random;

public class Game {
    private int scoreGagne;
    private int scorePerdu;
    private int scoreEgalite;
    private int nbJoueurs;
    private int nbTours;
    private Random rand;
    private String[] options = {"Pierre", "Papier", "Ciseaux"};

    public Game() {
        this.scorePerdu=0;
        this.scoreGagne=0;
        this.scoreEgalite=0;
        this.nbJoueurs=0;
        this.nbTours=10;
        this.rand=new Random();
    }

    public String getComputerChoice() {
        return options[rand.nextInt(options.length)];
    }

    
}
