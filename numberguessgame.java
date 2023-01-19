package numberguess;
import java.util.Random; 
import java.util.Scanner;
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
        System.out.println("please input a number between 1 and 100 to start");
        game(sc);
    }
    public static void game(Scanner sc) {
        int num = 0;
        Random r = new Random();  
        int randInt = r.nextInt(100);
        while (!(num == randInt)) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (!(num <= 100 && num >= 1)) {
                    System.out.println("You input a number that is out of the guess range, please input a number between 1 and 100!");
                } else if(num > randInt){
                    System.out.println("The number is less than " + num + ", please reguess!");
                }else if(num < randInt){
                    System.out.println("the number is more than " + num + ", please reguess!");
                }
            } else {
                System.out.println("You did not input a number, please input one between 1 and 100!");
                sc.next();
            }
        }
        System.out.println("Congrats you won!!!");
    }
}
