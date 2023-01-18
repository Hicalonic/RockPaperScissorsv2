package rps;

import rps.Choices;

public class Player {
    private String name;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Choices playerChoice() {
        switch(getRandomNumber()) {
            case 1:
                return Choices.ROCK;
            case 2:
                return Choices.PAPER;
            case 3:
                return Choices.SCISSORS;
            default:
                return null;
        }
    }
        public int getRandomNumber () {
            return (int) Math.floor(Math.random() * (3) + 1);
        }
}
