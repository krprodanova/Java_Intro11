package qa.automation;

import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1st

        String testString = "My name is <Nina>";

        System.out.println(testString);

        System.out.println("Enter your name:");

        String name = scanner.nextLine();

        String replacedString = testString.replace("<Nina>", name);

        System.out.println(replacedString);

        //2nd
        System.out.println("Enter first1name:");

        String first1name = scanner.nextLine();

        System.out.println("Enter first2name:");

        String first2name = scanner.nextLine();

        System.out.println(first1name.equals(first2name));

        //3th
        System.out.println("Enter text and count spaces:");

        String toBeCounted = scanner.nextLine();

        String [] stringArray = toBeCounted.split("");

        System.out.println("\""+toBeCounted+"\""+ "have" + stringArray.length + "spaces");

        //4th
        String String1 = "The";

        String String2 = "sky";

        String String3 = "is blue";

        System.out.println(String1 + " " + String2 + " " +String3);


    }
}
