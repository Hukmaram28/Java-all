import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String args[]) {
        long number;     // user input
        long remainder;          //remainder
        long sum = 0;    //reversed number
        long temp;       //To store the original number(user input)
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a Number");
        number = num.nextLong(); //user input
        temp = number;   //storing number into another temp variable
        while (number > 0) {
            remainder = number % 10;  //getting remainder
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (temp == sum) {
            long x = temp; //storing temp value
            long add = 0; //addition of even digits
            while (temp > 0) {
                remainder = temp % 10;    //getting remainder
                if (remainder % 2 == 0) {
                    add = add + remainder;  //adding even digits
                }
                temp = temp / 10;
            }
            if (add > 25) {
                System.out.println(x + " is palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println(x + " is palindrome and the sum of even numbers is less than or equal to 25");
            }
        } else {
            System.out.println(temp + " is not palindrome");
        }
    }
}