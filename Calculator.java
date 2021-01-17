import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);

        String expression = " ";

        String RegEx ="^\\d+\\.?\\d*[\\+\\-\\*\\/]\\d+\\.?\\d*$";

        Pattern pattern = Pattern.compile(RegEx);

        boolean isValid = false;

        while(isValid == false){

            System.out.println("Enter an expression");

            expression = input.nextLine();

            Matcher matcher = pattern.matcher(expression);

            isValid = matcher.find();

            if(expression.equals("exit")){
                System.exit(0);
                System.out.println("failed to exit");
            }
    
        }

        String numbers[] = expression.split("[+\\-\\*\\/]");

        double num1 = Double.parseDouble(numbers[0]);
        double num2 = Double.parseDouble(numbers[1]);

        double answer = 0;

        if(expression.contains("+")){
            
            answer = num1 + num2;
        
        }else if(expression.contains("-")){
            
            answer = num1 - num2;
        
        }else if(expression.contains("*")){
            
            answer = num1 * num2;
        
        }else{
            
            answer = num1 / num2;
        
        }     

        System.out.println(answer);

    }
    
}