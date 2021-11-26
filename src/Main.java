import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String[] guessBoard = {"", "", "", "", ""};


    public static void julieTurn() {

    }

    public static int getUserGuess() {
        System.out.println("its your turn , enter a number between 0-4");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String getUserName() {
        System.out.println("please enter your name");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static void playerTurn(int playerGuess, String playerName) {

    }

    public static void main(String[] args) {
        System.out.println("welcome to the guessing game, please enter your name to start");
        boolean win = false;
        String playerName = getUserName();
        while (!win) {


            int playerGuess = getUserGuess();
            playerTurn(playerGuess, playerName);


        }
    }
}
