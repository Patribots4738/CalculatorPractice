import java.util.Scanner;

public class Functions{

   static Scanner scanner;

   // Add Function 
    public static void add(){
 
        try
         {
            scanner = new Scanner(System.in); 
            double firstNum, secondNum, answer; 

            System.out.println("Enter your first number");
            firstNum = scanner.nextDouble(); 

            System.out.println("Enter your second number: ");
           secondNum = scanner.nextDouble();

           answer = firstNum + secondNum;
           System.out.println(answer);
         }
            catch (Exception e)
         {
                System.out.println("Invalid input");
          }
            
    }


// Minus Function
   public static void minus(){
 
        try
         {
            scanner = new Scanner(System.in); 
            double firstNum, secondNum, answer; 

            System.out.println("Enter your first number");
            firstNum = scanner.nextDouble(); 

            System.out.println("Enter your second number: ");
           secondNum = scanner.nextDouble();

           answer = firstNum - secondNum;
           System.out.println(answer);
         }
            catch (Exception e)
         {
                System.out.println("Invalid input");
          }
         
    }


// Multiply Function
    public static void muitiply(){
 
        try
         {
            scanner = new Scanner(System.in); 
            double firstNum, secondNum, answer; 

            System.out.println("Enter your first number");
            firstNum = scanner.nextDouble(); 

            System.out.println("Enter your second number: ");
           secondNum = scanner.nextDouble();

           answer = firstNum * secondNum;
           System.out.println(answer);
         }
            catch (Exception e)
         {
                System.out.println("Invalid input");
          }
           
    }


// Divide Function
    public static void divide(){

      try
       {
          scanner = new Scanner(System.in); 
          double firstNum, secondNum, answer; 

          System.out.println("Enter your first number");
          firstNum = scanner.nextDouble(); 

          System.out.println("Enter your second number: ");
         secondNum = scanner.nextDouble();

         answer = firstNum / secondNum;
         System.out.println(answer);
       }
          catch (Exception e)
       {
              System.out.println("Invalid input");
        }
         
  }
   }