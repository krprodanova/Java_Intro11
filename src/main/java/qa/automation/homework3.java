package qa.automation;

import com.sun.source.util.SourcePositions;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class homework3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");

        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");

        int num2 = scanner.nextInt();

        System.out.println("Enter third number:");

        int num3 = scanner.nextInt();

        int result = 0;

        result = num3>((num1>num2) ? num1:num2) ? num3 : ((num1>num2) ? num1 : num2);

        System.out.println("The largest number is:" + result);

        //1st

       System.out.println("Enter a height of rectangle:");

       int height = scanner.nextInt();

        System.out.println("Enter a length of rectangle:");

        int length = scanner.nextInt();

        int rectanglePerimeter = 2*(height + length);

        int rectangleArea = (height * length);

        System.out.println("The perimeter is:" + rectanglePerimeter);

        System.out.println("The area is:" + rectangleArea);

        //2nd

        System.out.println("Enter a number");

        int number = scanner.nextInt();

        if (number % 2 == 0) {

            System.out.print("even");
        } else  {

            System.out.print("odd");

            }

        //3th

        System.out.println("Enter number from 1 to 7");

        int enteredNumber = scanner.nextInt();
            switch (enteredNumber){
                case 1:

                    System.out.println("Selected day is Monday");

                    break;

                case 2:

                    System.out.println("Selected day is Tuesday");

                    break;

                case 3:

                    System.out.println("Selected day is Wednesday");

                    break;

                case 4:

                    System.out.println("Selected day is Thursday");

                    break;

                case 5:

                    System.out.println("Selected day is Friday");

                    break;

                case 6:

                    System.out.println("Selected day is Saturday");

                    break;

                case 7:

                    System.out.println("Selected day is Sunday");

                    break;

                default:

                    System.out.println("Not correct option");







            }
        }



    }




