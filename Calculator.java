import java.util.Scanner;

public class Calculator {

<<<<<<< Updated upstream
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
=======
    Scanner input = new Scanner(System.in);

    public static void main(String[]... args) {

        System.out.println("Please input your operation, your options are: +, -, *, /");

        String operationInput = input.nextLine();

        while (!isValidInput(operationInput, 'o')) {

            System.out.println("Invalid operation, your options are: +, -, *, /");

            operationInput = input.nextLine();

        }

    }

    public static boolean isValidInput(String input, char type) {

        boolean isValid = false;

        switch (type) {

            case 'o':

                if (input.length() == 1) {

                    switch (input.charAt(0)) {

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

                } catch (Exception e) {
                }

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

>>>>>>> Stashed changes
}