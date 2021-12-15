import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {

        String input = "";
        double num1;
        double num2;
        boolean conversionContinue = true;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Hello");
        while (conversionContinue) {
            System.out.print("What measurement would you like to convert from? \n" +
                    "Enter F for Fahrenheit or C for Celcius \n" + ">");
            input = stdin.nextLine();
            if (input.equalsIgnoreCase("F")) {
                String numberTemp = "";
                System.out.print("Please enter what Fahrenheit temperature you would like to convert. \n" + ">");
                numberTemp = stdin.nextLine();
                num1 = Double.parseDouble(numberTemp);
                //*System.out.println(num1);
                double fahrenheitResult = (num1 - 32) * 5 / 9;
                System.out.println("You temp converted is " + fahrenheitResult + " celcius");
                conversionContinue = false;
                System.out.println("Would you like to perform another conversion? \n" + ">");
                input = stdin.nextLine();
                if (input.equalsIgnoreCase("yes")) {
                    conversionContinue = true;
                } else {
                    System.out.println("Thank you for using the converter.");
                }
            } else if (input.equalsIgnoreCase("C")) {
                String numberTemp = "";
                System.out.print("Please enter what Celcius temperature you would like to convert. \n" + ">");
                numberTemp = stdin.nextLine();
                num2 = Double.parseDouble(numberTemp);
                //*System.out.println(num2);
                double celciusResult = (num2 * 1.8) + 32;
                conversionContinue = false;
                System.out.println("input: " + input);
                System.out.println("Your conversion is " + celciusResult + " fahrenheit.");
                System.out.print("Would you like to perform another conversion?: ");
                input = stdin.nextLine();
                if (input.equalsIgnoreCase("yes")) {
                    conversionContinue = true;
                } else {
                    System.out.println("Thank you for using the converter.");
                }
            } else {
                System.out.println("Thank you for visiting the converter. Goodbye.");
            }
            /**
             * You will be creating a program that will convert temperatures.
             * 1. Your program should be able to do conversion from fahrenheit to celsius
             * 2. Your program should be able to do conversion from celsius to fahrenheit
             *
             * How this will work:
             * 1. You will prompt the user for what conversion they're looking to do:
             *  - a fahrenheit to celsius conversion
             *  - a celsius to fahrenheit conversion
             * 2. Once there, you will ask them what temperature they would like to convert
             * 3. You will do the conversion
             *  - fahrenheit to celsius equation: (user's temperature - 32) x (5/9)
             *  - celsius to fahrenheit equation: (user's temperature x 1.8) + 32
             * 4. Print out the converted temperature.
             * 5. Ask user if they would like to do another conversion
             *  - If yes, repeat step 1 - 4
             *  - If no, exit
             */


        }
    }
}


