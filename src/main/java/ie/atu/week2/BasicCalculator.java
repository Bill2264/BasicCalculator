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


        //decide operation
        System.out.println("Choose an Operation(add, subtract, multiply, divide): ");
        String operation = scan1.next();

        //calculate results
        double result = switch (operation)
        {
            case "add" -> {
                yield FirstNumber + SecondNumber;
            }


            case "subtract" -> {
                yield FirstNumber - SecondNumber;
            }

            case "multiply" -> {
                yield FirstNumber * SecondNumber;
            }
            case "divide" -> {
                if(SecondNumber == 0)
                {
                    System.out.println();
                    yield 0;
                }
                else {
                    yield FirstNumber / SecondNumber;
                }
            }

            default ->{
                System.out.println("Invalid Operation");
                yield 0;
            }

        };
        //display results
        System.out.println("Results: " + result);
    }
}
