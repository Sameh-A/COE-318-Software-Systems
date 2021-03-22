package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

    @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

    @Override
    public void display() {
        System.out.println("House Holds: \n" + this.game.getHouseCards().toString()); // House Cards
        System.out.println("You Hold: \n" + this.game.getYourCards().toString()); // Your Cards
    }

    @Override
    public boolean hitMe() {
        System.out.println("another card? (yes/no)");
        String choice = user.nextLine();
        boolean hit = false;
        switch(choice){
            case "yes":
                hit = true;
                break;
            case "no":
                hit = false;
                break;
            default:
                System.out.println("You must type either 'y' or 'n'.");
                hitMe();
        }
        return(hit);
    }

    @Override
    public void gameOver() {
        this.display();
        int ScoreOfPlayer = game.score(game.getYourCards());
        int ScoreOfHouse = game.score(game.getHouseCards());
        System.out.println("House Score: " + ScoreOfHouse + ", Your Score: " + ScoreOfPlayer);
        if( (ScoreOfPlayer > ScoreOfHouse || ScoreOfHouse > 21) && (ScoreOfPlayer <= 21)){
            System.out.println("You Win");
        }else{
            System.out.println("The House Wins");
        }
     

    }

}