import java.util.Scanner;

public class Calculator {

    Scanner input = new Scanner(System.in);

    public static void main(String[]... args) {

        System.out.println("Please input your operation, your options are: +, -, *, /");

        String operationInput = input.nextLine();

        while(!isValidInput(operationInput, 'o')) {

            System.out.println("Invalid operation, your options are: +, -, *, /");

            operationInput = input.nextLine();
            
        }
        

    }

    public static boolean isValidInput(String input, char type) {

        boolean isValid = false;

        switch(type) {

            case 'o':

            if(input.length() == 1) {

                switch(input.charAt(0) {

                    case '+':

                        isValid = true;

                    break;

                    case '-':

                        isValid = true;

                    break;

                    case '*':

                        isValid = true;

                    break;

                    case '/':

                        isValid = true;

                    break;

                }

            }

            break;

            case 'n':

            try {

                Double.parseDouble(input);

                isValid = true;

            } catch(Exception e) {}

            break;

        }

        return isValid;

    }

    public static double add(double num1, double num2) {

        return num1 + num2;

    }

    public static double subtract(double subtrahend, double minuend) {

        return subtrahend - minuend;

    }

    public static double multiply(double num1, double num2) {

        return num1 * num2;

    }

    public static double divide(double dividend, double divisor) {

        return dividend / divisor;

    }
    
}