import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner stg = new Scanner(System.in);
        String word = stg.next(); //User Input the string
        System.out.println(reverseString(word)); //Calling the reverse function and giving output
    }

    public static String reverseString(String s) { // Function to reverse the string
        char c[] = s.toCharArray();  //Converting string into array
        int i = 0, j = c.length - 1;
        while (i < j) {             //Reversing the array elements
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return new String(c); //Returning the reversed string
    }
}