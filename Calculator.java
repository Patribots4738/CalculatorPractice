import java.util.Scanner;

public class Calculator {

    static Scanner input = new Scanner(System.in);
    
    enum Functions {

        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE

    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO THE ANGRY CALCULATOR REEEEEEEEEEEEEEE");

        while (true) {

            Functions functions = getFunction();

            double[] nums = getNums();

            double output = math(functions, nums);

            System.out.println ("YOUR OUTPUT IS " + output + "     GOOD DAY TO YOU!!!!!!!!!");

        }

    }

    public static double math(Functions functions, double[] arr) {

        double output = 0;

        switch (functions) {

            case ADD:
                output = arr[0] + arr[1];
                break;
                
            case SUBTRACT:
                output = arr[0] - arr[1];
                break;

            case MULTIPLY:
                output = arr[0] * arr[1];
                break;

            case DIVIDE:
                output = arr[0] / arr[1];
                break;

            default:

        }

        return output;

    }

    public static double[] getNums() {

        double[] arr = new double[2];

        boolean running = true;

        while (running) {

            try {

                System.out.println("GIVE ME A NUMBER!!!!!!");

                arr[0] = Double.parseDouble(input.nextLine());

                running = false;

            } catch (Exception e) {

                System.out.println("HEY! THAT IS NOT A NUMBER.");

            }

        }

        running = true;

        while (running) {

            try {

                System.out.println("GIVE ME ANOTHER NUMBER!!!!!!");

                arr[1] = Double.parseDouble(input.nextLine());

                running = false;

            } catch (Exception e) {

                System.out.println("HEY! THAT IS NOT A NUMBER.");

            }

        }

        return arr;

    }

    public static Functions getFunction() {

        Functions functions = Functions.ADD;

        String input;

        boolean running = true;

        while (running) {

            System.out.println("WHAT FUNCTION DO YOU WANT TO USE!!!!! (\"+\", \"-\", \"*\", or \"/\")");

            input = Calculator.input.nextLine();

            switch (input) {

                case "+":
                    functions = Functions.ADD;
                    running = false;
                    break;

                case "-":
                    functions = Functions.SUBTRACT;
                    running = false;
                    break;

                case "*":
                    functions = Functions.MULTIPLY;
                    running = false;
                    break;

                case "/":
                    functions = Functions.DIVIDE;
                    running = false;
                    break;

                default:

            }

        }

        return functions;

    }

}