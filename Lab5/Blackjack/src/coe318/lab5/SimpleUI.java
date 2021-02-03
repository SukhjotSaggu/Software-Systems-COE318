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
        System.out.println("House Holds: \n===========" + this.game.getHouseCards().toString()); // House Cards
        System.out.println("You Hold: \n=========" + this.game.getYourCards().toString()); // Your Cards
    }

  @Override
    public boolean hitMe() {
        System.out.println("Do you want another card? (y/n)");
        String choice = user.nextLine();
        boolean again = false;
        
        switch(choice){
            case "y":
                again = true;
                break;
            case "n":
                again = false;
                break;
            default:
                System.out.println("Please choose 'y' or 'n'.");
                hitMe();
        }
        return again;
    }

  @Override
    public void gameOver() {
        this.display();
        int finalScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        System.out.println("House Scored: " + houseScore + ", You Scored: " + finalScore);
        if( (finalScore > houseScore || houseScore > 21) && (finalScore <= 21)){
            System.out.println("You Won");
        }else{
            System.out.println("House Won");
        }
    }
}