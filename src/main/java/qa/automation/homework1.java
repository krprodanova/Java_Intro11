package qa.automation;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {

        System.out.println("Please enter your first name");

        Scanner scanner = new Scanner (System.in);

        String firstName = scanner.next();

        System.out.println("Please enter your last name");

        String lastName = scanner.next();

        System.out.println("Enter your favorite hobby");

        String hobby = scanner.next();

        System.out.println("Your firstName is " + firstName + " and your last name is " + lastName + " and your favorite hobby is " + hobby);
    }
}
