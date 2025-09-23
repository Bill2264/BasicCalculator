package ie.atu.week2;

import java.util.Scanner;

public class BasicCalculator {
    static void main() {
        //Prompt for number
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter first number: ");

        double FirstNumber = scan1.nextDouble();
        System.out.println(FirstNumber);

    }
}
