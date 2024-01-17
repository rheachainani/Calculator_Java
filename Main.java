// Rhea Chainani, 22070126086, SY AIML-B1

package Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // printing menu
        System.out.println("For two numbers : ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("For an array of integers : ");
        System.out.println("5. Sum");
        System.out.println("6. Mean");
        System.out.println("7. Median");
        System.out.println("8. Mode");
        System.out.println("9. Variance");
        System.out.println("10. Standard Deviation");

        // taking choice from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice = scan.nextInt();

        // create an instance of the UserInput class
        UserInput input = new UserInput();

        // now perform the mathematical function based on user's choice
        
        if (choice >= 1 && choice <= 4) {
            int[] numbers = new int[2];
            numbers = input.inputNumbers();
            int num1 = numbers[0];
            int num2 = numbers[1];

            if (choice == 1) {
                System.out.println(num1 + " + " + num2 + " = " + Calculator.add(num1, num2));
            }

            else if (choice == 2) {
                System.out.println(num1 + " - " + num2 + " = " + Calculator.subtract(num1, num2));
            }

            else if (choice == 3) {
                System.out.println(num1 + " x " + num2 + " = " + Calculator.multiply(num1, num2));
            }

            else if (choice == 4) {
                System.out.println(num1 + " / " + num2 + " = " + Calculator.divide(num1, num2));
            }
        }

        else if (choice <= 10) {
            // ask the number of elements in array
            System.out.println("Enter the number of elements in array : ");
            int size = scan.nextInt();
            int[] array = input.inputArray(size);

            switch (choice) {
                case 5:
                    System.out.println("Sum of elements of array = " + Calculator.findSum(array, size));
                    break;
                case 6:
                    System.out.println("Mean of elements of array = " + Calculator.findMean(array, size));
                    break;
                case 7:
                    System.out.println("Median of elements of array = " + Calculator.findMedian(array, size));
                    break;
                case 8:
                    System.out.println("Mode of elements of array = " + Calculator.findMode(array, size));
                    break;
                case 9:
                    System.out.println("Variance of elements of array = " + Calculator.findVariance(array, size));
                    break;
                case 10:
                    System.out.println("Standard deviation of elements of array = " + Calculator.findStandardDeviation(array, size));
                    break;
            }
        }

        else {
            System.out.println("Invalid input choice.");
        }

        scan.close();
    }
}
