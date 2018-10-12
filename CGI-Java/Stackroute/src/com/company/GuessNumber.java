import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Enter a target number between 1 to 100 : ");
        Scanner num = new Scanner(System.in);
        int TargetNumber = num.nextInt(); //Number to be guessed
        for (int i = 0; i < 99; i++) {
            System.out.println("Guess the number: ");
            int GuessedNumber = num.nextInt(); //User Input, guessed number by user
            if (GuessedNumber == TargetNumber) { //if number matches
                System.out.println("Number guessed matches the Target number.");
                System.exit(0);
            } else if (GuessedNumber > TargetNumber) { //guessed Number is more than target number
                System.out.println("Number guessed is more than target number.");
            } else if (GuessedNumber < TargetNumber) { //guessed number is less than target number
                System.out.println(" Number guessed is less than target number.");
            }
        }
    }
}