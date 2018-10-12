import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scan.nextInt(); //user input a number

        System.out.println("Entered Number is: ");
        System.out.print(number);
    }

}