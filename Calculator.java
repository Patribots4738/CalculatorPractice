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
                System.out.println("Hello?");

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

                System.out.println("BRUH. THAT IS NOT A NUMBER.");

            }

        }

        running = true;

        while (running) {

            try {

                System.out.println("GIVE ME ANOTHER NUMBER!!!!!!");

                arr[1] = Double.parseDouble(input.nextLine());

                running = false;

            } catch (Exception e) {

                System.out.println("BRUH. THAT IS NOT A NUMBER.");

            }

        }

        return arr;

    }

    public static Functions getFunction() {

        Functions functions = Functions.ADD;

        String input;

        boolean running = true;

        while (running) {

            System.out.println("WHAT FUNCTION DO YOU WANT TO USE!!!!! (\"A\", \"S\", \"M\", or \"D\")");

            input = Calculator.input.nextLine();

            if (input.equals("A")) {

                functions = Functions.ADD;
                running = false;

            } else if (input.equals("S")) {

                functions = Functions.SUBTRACT;
                running = false;

            } else if (input.equals("M")) {

                functions = Functions.MULTIPLY;
                running = false;

            } else if (input.equals("D")) {

                functions = Functions.DIVIDE;
                running = false;

            } else {

                System.out.println("Yo. You entered in not a real thing to do. Do it again. Or else...");

            }

        }

        return functions;

    }

}