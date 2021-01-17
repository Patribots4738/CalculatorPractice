import java.util.Scanner;

public class Calculator 
{
    static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {

    while(true){
        System.out.println("Enter your operation.");
        String calculatorString = scanner.nextLine(); 

        switch (calculatorString) {
            case "+":
                Functions.add();
                
                break;
    
            case "-":
                Functions.minus();
    
                break;
    
            case "*":
            Functions.muitiply();
    
                break; 
        } 
    
    }
   

}
}