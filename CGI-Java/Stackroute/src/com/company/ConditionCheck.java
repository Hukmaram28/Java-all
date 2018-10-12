import java.util.Scanner;

public class ConditionCheck {

    public static void main(String[] args) {
        int number;                             // user input number
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a Number");
        number = num.nextInt();     // user input
        if (number > 20 && number < 30) {
            if (number % 2 != 0) {
                System.out.println("Tom");
            } else {
                System.out.println("Jerry");
            }
        } else {
            System.out.println("Number doesn't exist between 20 and 30");
        }
    }
}