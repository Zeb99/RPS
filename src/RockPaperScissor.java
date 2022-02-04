/* Zeb Fischer-Crawford
 * COP3330 Object Oriented Programming
 * Spring 2022
 * Programming Assignment 1 Class File
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    private int userWins;
    private int computerWins;
    private int game;
    private Random rand;
    private Scanner input;
    
    public RockPaperScissor(int game, int seed, Scanner input){    
        this.game = game;
        this.input = input;
        this.rand = new Random(seed);
    }

    public static void greeting(){
            System.out.println("Welcome to the Rock...Paper...Scissor Game!\n" +
                                "Let me tell you the rules to this game.\n" +
                                "You and I will get to choose rock, paper, or scissor.\n" +
                                "After we made a decision, we will then reveal the choices we both made and\n" + 
                                "decide a winner based on these rules.\n" +
                                "Rock beats Scissor!\n" +
                                "Paper beats Rock!\n" +
                                "Scissor beats Paper!\n" +
                                "If we both pick the same option, then it is a tie.\n" +
                                "Ready to play? Here we go! I've been told by users that I'm really good!");
    }

    public void playRound(){
        int p1, p2, winner;
        while(userWins < 3 || computerWins < 3){
            System.out.println("Game " + game + " Tally");
            System.out.printf("Player 1:\t%d\n",userWins);
            System.out.printf("Player 2:\t%d\n",computerWins);

            p1 = userChoice();
            p2 = computerChoice();
            winner = choiceBattle(p1, p2);

            if(winner == 0){
                System.out.println("A Tie Occur.");
            } else if(winner == 1){
                System.out.println("Player 1 gets a point.");
                userWins++;
            } else if(winner == 2){
                System.out.println("Player 2 gets a point.");
                computerWins++;
            }
        }
    }

    //The user is p1 and the computer is p2
    public int choiceBattle(int p1, int p2){
        int decision = 3; // three is a flag value
        String r = "Rock";
        String p = "Paper";
        String s = "Scissor";

        if(p1 != p2){
            switch(p1){
                case 1:
                 switch(p2){
                     case 2:
                         System.out.printf("You used %s and I used %s!\n",r,p);
                         System.out.printf("%s beats %s!\n",p,r);
                         decision = 2;
                         break;
                     case 3:
                         System.out.printf("You used %s and I used %s!\n",r,s);
                         System.out.printf("%s beats %s!\n",r,s);
                         decision = 1;
                         break;
                     }
                case 2:
                 switch(p2){
                     case 1:
                         System.out.printf("You used %s and I used %s!\n",p,r);
                         System.out.printf("%s beats %s!\n",p,r);
                         decision = 1;
                         break;
                     case 3:
                         System.out.printf("You used %s and I used %s!\n",p,s);
                         System.out.printf("%s beats %s!\n",s,p);
                         decision = 2;
                         break;
                     } 
                case 3:
                 switch(p2){
                     case 1:
                         System.out.printf("You used %s and I used %s!\n",s,r);
                         System.out.printf("%s beats %s!\n",r,s);
                         decision = 2;
                         break;
                     case 2:
                         System.out.printf("You used %s and I used %s!\n",s,p);
                         System.out.printf("%s beats %s!\n",s,p);
                         decision = 1;
                         break;
                 } 
            }
        } else {
            System.out.println("Tie!");
            decision = 0;
        }
       return decision;
    }

    public int userChoice(){
        int choice;
        System.out.print("It is your turn to choose.\n" +
                            "1: Rock\n" +
                            "2: Paper\n" + 
                            "3: Scissor\n" + 
                            "Enter your choice: ");
        choice = input.nextInt();

        if(choice > 3 || choice < 1){
            while(choice > 3 || choice < 1){
                System.out.println("That is not a valid choice. Please try again.");
                choice = input.nextInt();
            }
        }
        switch(choice){
            case 1:
                System.out.println("You have selected rock.");
                break;
            case 2:
                System.out.println("You have selected paper.");
                break;
            case 3:
                System.out.println("You have selected scissor.");
                break;
        }

        return choice;
    }

    public int computerChoice(){
        int max = 3, min = 1;
        int choice = rand.nextInt(max - min) + min;
        return choice;
    }

    public int getWinner(){
        if(userWins == 3){
            return 1;
        } 
        return 2;
    }
}
