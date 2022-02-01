import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    Random rand = new Random();
    
    RockPaperScissor(int game, int seed, Scanner input){    
        int userWins = 0;
        int computerWins = 0;
        int random = seed;
        int gameNum = game;
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
    /**public void playRound(){

    }
    /**public int choiceBattle(int p1, int p2){

    }**/
    public int userChoice(){
        System.out.println("It is your turn to choose.\n" +
                            "1: Rock\n" +
                            "2: Paper\n" + 
                            "3: Scissor\n" + 
                            "Enter your choice: ");
        int choice = 
    }
    /**public int computerChoice(){

    }
    public int getWinner(){

    }**/
}
