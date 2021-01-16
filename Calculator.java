import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);

        String expression = " ";

        Pattern pattern = Pattern.compile("^[0-9\\+\\-\\*\\/]*$");

        boolean isValid = false;

        while(isValid == false){

            System.out.println("Enter an expression");

            expression = input.nextLine();

            Matcher matcher = pattern.matcher(expression);

            isValid = matcher.find();
    
        }

        String numbers[] = expression.split("[+\\-\\*\\/]");

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        int answer = 0;

        if(expression.contains("+")){
            
            answer = num1 + num2;
        
        }

        if(expression.contains("-")){
            
            answer = num1 - num2;
        
        }        

        if(expression.contains("*")){
            
            answer = num1 * num2;
        
        }

        if(expression.contains("/")){
            
            answer = num1 / num2;
        
        }     

        System.out.println(answer);

    }
    
}