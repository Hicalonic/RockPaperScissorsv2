package rps;

import rps.Game;

public class Main {
    public static void main(String[] args) {

        Player jon = new Player("John");
        Player andy = new Player("Andy");

        Game jogo = new Game(jon,andy);

        jogo.runGame(5);


    }
}