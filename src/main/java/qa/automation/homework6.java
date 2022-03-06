package qa.automation;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        //1st valid password
        System.out.println("Enter a password: ");
        Scanner scanner = new Scanner(System.in);

        String validPassword = scanner.nextLine();
        int n = Validation(validPassword);
        if (n == 1) {
            System.out.println("It is a valid password: ");
        } else {
            System.out.println("It is not a valid password: ");
        }
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();
        PositiveAndEqual(a, b, c);

        System.out.println("Enter number one:");
        double one = scanner.nextDouble();
        System.out.println("Enter number two:");
        double two = scanner.nextDouble();
        averageValue(one, two);
        sumValue(one, two);

    }

    private static int Validation(String validPassword) {
        if (validPassword.matches(".*[0-9].*") && validPassword.matches(".*[@#$%!&].*") && validPassword.matches(".*[A-Z].*") && validPassword.matches(".*[a-z].*") && validPassword.length() >= 8) {
            return 1;
        } else {
            return -1;
        }

    }
    //2nd positive and equals numbers
    public static void PositiveAndEqual (int a, int b, int c) {
        if(a>0){
            System.out.println("First number is positive: ");
        }else{
            System.out.println("First number is negative: ");
        }
        if (b > 0){
            System.out.println("Second number is positive: ");

        }else{
            System.out.println("Second number is negative: ");
        }
        if (c>0){
            System.out.println("Third number is positive: ");
        }else{
            System.out.println("Third nmber is negative: ");
        }
        if(a==b && b==c){
            System.out.println("Numbers are equal");
        }else if (a==b || b==c || a==c){
            System.out.println("Some numbers are equal");
        }else{
            System.out.println("Numbers are not equal");
        }

    }
    //3th average, sum int
    public static double averageValue(double one, double two){
        double result;
        result = (one + two)/2;
        System.out.println("The average value is:" + result);
        return result;


    }

    public static double sumValue(double one, double two) {
        double result;
        result = one + two;
        System.out.println("The sum value is:" + result);
        return result;

    }

}