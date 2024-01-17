package Assignment1;

import java.util.*;

public class Calculator {
    // function to add two numbers
    public static int add(int num1, int num2) 
    {
        return num1 + num2;
    }

    // function to subtract two numbers
    public static int subtract(int num1, int num2) 
    {
        return num1 - num2;
    }

    // function to multiply two numbers
    public static int multiply(int num1, int num2) 
    {
        return num1 * num2;
    }

    // function to divide two numbers
    public static double divide(int num1, int num2) 
    {
        if (num2 != 0) {
            return num1 / num2;
        } 
        else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }

    // function for calculating sum of array
    public static int findSum(int array[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += array[i];
 
        return sum;
    }

    // function for calculating mean of array
    public static double findMean(int array[], int n)
    {
        return findSum(array, n) / (double)n;
    }
 
    // function for calculating median of array
    public static double findMedian(int array[], int n)
    {
        // sort the array
        Arrays.sort(array);
 
        // check for even case
        if (n % 2 != 0)
            return (double)array[n / 2];
 
        return (double)(array[(n - 1) / 2] + array[n / 2]) / 2.0;
    }
    
    // function for calculating mode of array
    public static int findMode(int array[], int n) 
    {
        int maxValue = 0, maxCount = 0, i, j;
  
        for (i = 0; i < n; i++) {
           int count = 0;
           for (j = 0; j < n; j++) {
              if (array[j] == array[i])
              count++;
           }
  
           if (count > maxCount) {
              maxCount = count;
              maxValue = array[i];
           }
        }
        return maxValue;
    }

    // function to calculate variance of array
    public static double findVariance(int array[], int n)
    {
        // get mean of array elements
        double mean = findMean(array, n);

        // Compute sum squared differences with mean
        double sqDiff = 0;
        for (int i = 0; i < n; i++) {
            sqDiff += (array[i] - mean) * (array[i] - mean);
        }
         
        return (double)sqDiff / n;
    }
    
    // function to calculate standard deviation of array
    public static double findStandardDeviation(int array[], int n)
    {
        return Math.sqrt(findVariance(array, n));
    }
    
}
