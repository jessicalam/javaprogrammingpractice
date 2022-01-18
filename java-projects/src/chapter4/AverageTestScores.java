package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String arg[]) {
        // initalize what we know
         int numberOfStudents = 24;
         int numberOfTests = 4;
         Scanner scanner = new Scanner(System.in);
         //proccess all studentss
        for (int i =0; i< numberOfStudents; i++){
            double total = 0;
            for (int j=0; j<numberOfTests; j++) {
                System.out.println("Enter the score for Test #" +( j+ 1));
                double score = scanner.nextDouble();
                total = total + score;

            }
            double average = total/numberOfTests;
            System.out.println("The test average for student #" + ( i+1 ) + " is " + average);
        }
        scanner.close();
    }


}
