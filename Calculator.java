import java.util.Scanner;

public class Calculator {

    static Scanner input = new Scanner(System.in);

    static String operationInput;

    static String num1Input;
    static String num2Input;

    static String doneInput;

    static boolean done = false;

    public static void main(String[] args) {

        while (!done) {

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("Please input your first number:");

            num1Input = input.nextLine();

            operandLoop(true);



            System.out.println("Please input your operation, your options are: +, -, *, /");

            operationInput = input.nextLine();

            operationLoop();



            System.out.println("Please input your second number:");

            num2Input = input.nextLine();

            operandLoop(false);



            char operation = operationInput.charAt(0);

            double num1 = Double.parseDouble(num1Input);
            double num2 = Double.parseDouble(num2Input);

            calculate(operation, num1, num2);

            
            
            System.out.println("Are you done? (Y/N)");

            doneInput = input.nextLine();

            doneLoop();

        }

    }

    public static void operationLoop() {

        while(!isValidInput(operationInput, 'o')) {

            System.out.println("Invalid operation, your options are: +, -, *, /");

            operationInput = input.nextLine();
            
        }

    }

    public static void operandLoop(boolean isFirst) {

        String currentNumInput = ((isFirst) ? num1Input:num2Input);

        while(!isValidInput(currentNumInput, 'n')) {

            System.out.println("Invalid, please input a number");

            currentNumInput = input.nextLine();            

        }

        if(isFirst) {

            num1Input = currentNumInput;

        } else {

            num2Input = currentNumInput;

        }

    }

    public static void doneLoop() {

        while(!isValidInput(doneInput, 'd')) {

            System.out.println("Invalid, please input either Yes or No");

            doneInput = input.nextLine();

        }

        switch(doneInput.toUpperCase().charAt(0)) {

            case 'Y':

                done = true;

            break;

            case 'N':

                done = false;

            break;

        }

    }

    public static boolean isValidInput(String input, char type) {

        boolean isValid = false;

        switch(type) {

            case 'o':

                if(input.length() == 1) {

                    switch(input.charAt(0)){

                        case '+':
                        case '-':
                        case '*':
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

            case 'd':

                switch(input.toUpperCase().charAt(0)) {

                    case 'Y':
                    case 'N':

                        isValid = true;

                    break;

                }

            break;

        }

        return isValid;

    }

    public static void calculate(char operation, double num1, double num2) {

        double result = 0.0;

        switch(operation) {

            case '+':

                result = add(num1, num2);

            break;

            case '-':

                result = subtract(num1, num2);

            break;

            case '*':

                result = multiply(num1, num2);

            break;

            case '/':

                result = divide(num1, num2);

            break;

        }

        System.out.println("your result is: " + result);

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