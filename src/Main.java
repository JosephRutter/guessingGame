import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String[] guessBoard = {"", "", "", "", ""};
    public static Scanner input = new Scanner(System.in);

    public static void julieTurn() {
        Random Random = new Random();
        int julieGuess = Random.nextInt(5);
        if (guessBoard[julieGuess].isEmpty()) {
            guessBoard[julieGuess] = ("julie");
        }
    }

    public static boolean userGuessValidCheck(int userGuess) {
        if (userGuess > 0 && userGuess < 5) {
            return true;
        } else {
            return false;
        }
    }

    public static int userGuessTypeCheck() {
        int userGuess;
        while (true) {
            try {
                userGuess = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("your input was not a number , please try again");
                input.next();
            }
        }
        return userGuess;
    }

    public static int getUserGuess() {
        int userGuess = 0;

        boolean userGuessValid = false;
        while (!userGuessValid) {
            System.out.println("please enter a number between 0-4");
            userGuess = userGuessTypeCheck();
            userGuessValid = userGuessValidCheck(userGuess);
        }
        return userGuess;
    }

    public static String getUserName() {
        System.out.println("please enter your name");
        return input.next();
    }

    public static void playerTurn(int playerGuess, String playerName) {
        if (guessBoard[playerGuess].isEmpty()) {
            guessBoard[playerGuess] = (playerName);
        }
    }

    public static void main(String[] args) {
        int julieScore = 0;
        int playerScore = 0;
        System.out.println("welcome to the guessing game, please enter your name to start");
        boolean win = false;
        String playerName = getUserName();
        while (!win) {


            int playerGuess = getUserGuess();
            playerTurn(playerGuess, playerName);
            System.out.println("input successful , computer has taken its turn");
            julieTurn();
            for (int i = 0; i < guessBoard.length; i++) {
                if (guessBoard[i].isEmpty()) {
                    win = false;
                    break;
                } else {
                    win = true;
                }
            }
        }
        for (int j = 0; j < guessBoard.length; j++) {
            if (guessBoard[j].contains("julie")) {
                julieScore++;
            } else {
                playerScore++;
            }
        }
        if(playerScore>julieScore){
            System.out.println("you scored "+playerScore+" the computer scored "+julieScore+ " you win!");
        }else{
            System.out.println("you scored "+playerScore+" the computer scored "+julieScore+ " you lose!");
    }
}}
