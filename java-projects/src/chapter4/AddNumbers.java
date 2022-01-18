package chapter4;

import java.util.Scanner;
public class AddNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do {
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num2 + num1;
            System.out.println("The sum is " + sum);
            System.out.println("Would you like to start over?");

            again = scanner.nextBoolean();
        } while (again);
        scanner.close();

    }
}