import java.util.Scanner;

public class SortNumberDigits {

    public static void main(String[] args) {
        int number; //User input number
        int index = 0; //variable for array index
        int size = 0; //variable for Array size
        int temp;  //variable to store array elements
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt(); //user input
        int k = number;  //Storing number into k for later use
        while (number > 0) {// to find total number of digits in number(size)
            size++;
            number /= 10;
        }
        int arr[] = new int[size]; //Array to store digits of number
        while (k > 0) { //Loop to store digits of number into the array
            int reminder;
            reminder = k % 10;
            arr[index] = reminder;
            index++;
            k /= 10;
        }
        for (index = 0; index < size; index++) { // Sorting the array
            for (int j = index + 1; j < size; j++) {
                if (arr[index] < arr[j]) {
                    temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int add = 0; //Addition of even digits
        for (index = 0; index < size; index++) {     // Adding the even digits of number and printing the sorted number
            if (arr[index] % 2 == 0) {
                add += arr[index];
            }
            System.out.print(arr[index]);
        }
        System.out.println("Sum of even Numbers : " + add);
        if (add > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}