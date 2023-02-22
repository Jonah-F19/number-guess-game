//package numberguess;
import java.util.Random; 
import java.util.Scanner;
import java.util.ArrayList;
public class numberguessgame {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, the goal of this game is to guess the correct number from 1-100, as you answer I will state if the number is higher or lower.");
        System.out.println(" Enter '1' to play!");
        Scanner sc = new Scanner(System.in);
        int play = 0;
        // asks for the input of 1 to play the game
        // error check, making sure you enter in 1, not a diff number or a letter
        while (play != 1) {
            if (sc.hasNextInt()) {
                play = sc.nextInt();
                if (play != 1) {
                    System.out.println("You input a incorrect number, please input 1 to start");
                }
            } else {
                System.out.println("You did not input the number 1, please input 1 to start");
                sc.next();
            }
        }
    
        // For integers, can convert easily using java.util.Random
        System.out.println("please input the max number for the guessing: ");
        int difficulty = sc.nextInt();
        System.out.println("Please guess a number between 1 and " + difficulty);
        game g = new game(difficulty);
    }
}
