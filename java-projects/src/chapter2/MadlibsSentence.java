package chapter2;

import java.util.Scanner;

public class MadlibsSentence {

    public static void main(String arg[]) {
        // 1. Ask the user for an adjective, season of the year and whole number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me an adjective:");
        String adjective = scanner.next();
        System.out.println("Please give a season of the year:");
        String season = scanner.next();
        System.out.println("Please give a whole number:");
        int wholenumber = scanner.nextInt();
        scanner.close();
        // 2. Then output the result: On a + adjective + season of the year + day, I drink a minimum of + wholenumber + cups of coffee.
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholenumber + " cups of coffee.");
    }
}
