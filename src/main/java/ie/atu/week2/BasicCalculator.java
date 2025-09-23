package ie.atu.week2;

import java.util.Scanner;

public class BasicCalculator {
    static void main() {
        //Prompt for first number
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter first number: ");

        double FirstNumber = scan1.nextDouble();
        System.out.println("You entered: " + FirstNumber);

        //Prompt for second number
        System.out.println("Please enter second number: ");

        double SecondNumber = scan1.nextDouble();
        System.out.println("You entered: " + SecondNumber);

        //display results
        double sum = FirstNumber + SecondNumber;
        System.out.println("The sum is: " + sum);
    }
}
