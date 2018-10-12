import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        int number; //Total number of values to be entered
        int sum = 0; // Sum of numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to give: ");
        number = scan.nextInt(); //User input
        System.out.println("Enter the values: ");
        for (int i = 0; i < number; i++) {
            long x = scan.nextInt(); // Entering values
            if (x == (int) x) { //Checking if number is integer
                sum += x;
            } else {
                System.out.println("Please enter only integers. ");
                System.exit(0);
            }
        }
        System.out.println("Sum is : " + sum);
    }
}