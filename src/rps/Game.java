package rps;

public class Game {
    public Player p1, p2;
    public Choices p1Choice, p2Choice;

    public int p1WinCounter, p2WinCounter;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void runGame(int gameRounds) {
        for(int i = 1; i <= gameRounds; i++) {
            p1Choice = p1.playerChoice();
            p2Choice = p2.playerChoice();
            play();
        }

    }
    public void play() {
        switch(checkResult()) {
            case WIN -> System.out.println(p1.getName() + " Wins with " + p1Choice + " against " + p2Choice);
            case LOSE -> System.out.println(p2.getName() + " Wins with " + p2Choice + " against " + p1Choice);
            case DRAW -> System.out.println(p1.getName() + " and " +p2.getName()+ " Draws with " +p1Choice+ " against " +p2Choice);
        }
    }
        public Check checkResult() {
            if (p1Choice == p2Choice) {
                return Check.DRAW;
            }
           return switch (p1Choice) {
                case ROCK: yield (p2Choice == Choices.SCISSORS ? Check.WIN : Check.LOSE);
                case SCISSORS: yield  (p2Choice == Choices.PAPER ? Check.WIN : Check.LOSE);
                case PAPER: yield (p2Choice == Choices.ROCK ? Check.WIN : Check.LOSE);
                };
        }

}



