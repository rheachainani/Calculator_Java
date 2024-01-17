package Assignment1;

import java.util.Scanner;

public class UserInput {
    public int[] inputNumbers() {

        // create scanner instance
        Scanner scan = new Scanner(System.in);

        // take input of the two numbers
        System.out.println("Enter the first number : ");
        int firstNumber = scan.nextInt();

        System.out.println("Enter the second number : ");
        int secondNumber = scan.nextInt();

        int[] numbers = new int[2];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;

        // close the scanner resources
        scan.close();

        return numbers;
    }

    public int[] inputArray(int size) {

        // create scanner instance
        Scanner scan = new Scanner(System.in);

        // create the array by taking input for each element using for loop
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i+1) + " : ");
            array[i] = scan.nextInt();
        }

        // close the scanner resources
        scan.close();

        return array;
    }
}
