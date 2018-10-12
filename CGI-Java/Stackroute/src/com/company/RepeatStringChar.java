import java.util.Scanner;

public class RepeatStringChar {

    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner scan = new Scanner(System.in);
        String word = scan.next(); // User Input the string
        System.out.println("Enter a number: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt(); //User input Number of characters to be repeated
        int length = word.length();  // length of the string entered
        System.out.print(word);
        for (int i = 1; i <= number; i++) {   //Printing the repeating characters
            for (int j = length - number; j < length; j++) {
                System.out.print(word.charAt(j));
            }
        }
    }
}