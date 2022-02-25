package qa.automation;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1st
        int[] arrayInt = new int[20];
        System.out.println("The numbers are: ");
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i * 5;
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
        //2nd
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];

        }
        int averageValue = sum / arrayInt.length;
        System.out.printf("Average value of the array elements is: %d", averageValue);

        //3th
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 0) {
                evenSum += arrayInt[i];
            } else {
                oddSum += arrayInt[i];
            }
            System.out.println("\nSum of even elements of array is: "+evenSum);
            System.out.println("\nSum of odd elements of array is: "+oddSum);


        }
        //4th
        System.out.print("Enter the value n: ");
        int n = scanner.nextInt();
        System.out.println("Numbers are: ");
        for (int i = 1; i <=n; i++) {
            System.out.println(i);

        }
        System.out.println("Not divided by 3 and 7 numbers are: ");
        for (int i = 0; i <=n; i++) {
            if(!(i % 3 == 0) && !(i % 7 == 0)){
                System.out.println(i);
            }
            //5th
            int f = 10, firstTerm = 0, secondTerm = 1;
            System.out.printf("Fibonacci Series till " + f + " terms:");
            for (int j = 1; j <= f ; j++) {
                System.out.println(firstTerm + ", ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;

            }

            
        }


    }


    }


