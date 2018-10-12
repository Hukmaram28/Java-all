import java.util.Scanner;

public class WordLetterChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next(); // User input a word
        word = word.toLowerCase(); //word into lowercase
        for (int i = 0; i < word.length(); i++) {           // loop to check if input is not a letter
            char ch = word.charAt(i); // ch is letter(of word)
            if (ch < 'a' || ch > 'z') {
                System.out.println("Error");
                System.exit(0);
            }
        }
        for (int i = 0; i < word.length(); ++i) {      // loop to check if letters are vowels or consonant
            char ch = word.charAt(i); // ch is word's letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " - vowel");
            } else if ((ch >= 'a' && ch <= 'z')) {
                System.out.println(ch + " - Consonant");
            }
        }
    }
}