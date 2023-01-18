package rps;

public class Game {
    public Player p1, p2;
    public Choices p1Choice, p2Choice;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void runGame() {
        p1Choice = p1.playerChoice();
        p2Choice = p2.playerChoice();
        play();
    }
    public void play() {
        switch(checkResult()) {
            case WIN:
                System.out.println(p1.getName() + " Wins with " + p1Choice + " against " + p2Choice);
                break;
            case LOSE:
                System.out.println(p2.getName() + " Wins with " + p2Choice + " against " + p1Choice);
                break;
            case DRAW:
                System.out.println(p1.getName() + " and " +p2.getName()+ " Draws with " +p1Choice+ " against " +p2Choice);
                break;
        }
    }
        public Check checkResult() {
            if (p1Choice == p2Choice) {
                return Check.DRAW;
            }
            switch (p1Choice) {
                case ROCK:
                    if(p2Choice == Choices.SCISSORS){
                        return Check.WIN;
                    }
                    else{ return Check.LOSE;
                    }

                case SCISSORS:
                    if(p2Choice == Choices.PAPER){
                        return Check.WIN;
                    }
                    else{  return Check.LOSE;
                    }
                case PAPER:
                    if(p2Choice == Choices.ROCK){
                        return Check.WIN;
                    }
                    else{ return Check.LOSE;
                    }
                default:
                    return null;
                }
        }

}



