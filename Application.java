package lab01;
import java.util.Scanner;
public class Application {
   public static void main(String[] args) {
       if (args.length > 0) {
           // Process CLI arguments
           handleArguments(args);
       } else {
          
           interactiveMode();
       }
   }
   // Method for the command-line arguments
   public static void handleArguments(String[] args) {
       if (args.length < 2) {
           System.out.println("Insufficient arguments provided.");
           return;
       }
       String operation = args[0].toLowerCase();
       double num1 = Double.parseDouble(args[1]);
       double num2 = args.length > 2 ? Double.parseDouble(args[2]) : 0;
      // Performs the operation that was put on the command-line
       switch (operation) {
           case "+":
               System.out.println("Result: " + add(num1, num2));
               break;
           case "-":
               System.out.println("Result: " + subtract(num1, num2));
               break;
           case "*":
               System.out.println("Result: " + multiply(num1, num2));
               break;
           case "/":
               if (num2 != 0) {
                   System.out.println("Result: " + divide(num1, num2));
               } else {
                   System.out.println("Cannot divide by zero");
               }
               break;
           case "!":
               System.out.println("Result: " + factorial((int) num1));
               break;
           default:
               System.out.println("Invalid operation");
       }
   }
   // Method for interactive mode
   public static void interactiveMode() {
       Scanner scanner = new Scanner(System.in);
       while (true) {
           System.out.println("Enter operation (+, -, *, /, !, exit): ");
           String operation = scanner.next().toLowerCase();
           if (operation.equals("exit")) {
               break;
           }
           // reads the value based on what operation was inputed
           switch (operation) {
               case "+":
                   System.out.println("Enter the first value:");
                   double num1Add = scanner.nextDouble();
                   System.out.println("Enter the second value:");
                   double num2Add = scanner.nextDouble();
                   System.out.println("Result: " + add(num1Add, num2Add));
                   break;
               case "-":
                   System.out.println("Enter the first value:");
                   double num1Subtract = scanner.nextDouble();
                   System.out.println("Enter the second value:");
                   double num2Subtract = scanner.nextDouble();
                   System.out.println("Result: " + subtract(num1Subtract, num2Subtract));
                   break;
               case "*":
                   System.out.println("Enter the first value:");
                   double num1Multiply = scanner.nextDouble();
                   System.out.println("Enter the second value:");
                   double num2Multiply = scanner.nextDouble();
                   System.out.println("Result: " + multiply(num1Multiply, num2Multiply));
                   break;
               case "/":
                   System.out.println("Enter the first value:");
                   double num1Divide = scanner.nextDouble();
                   System.out.println("Enter the second value:");
                   double num2Divide = scanner.nextDouble();
                   if (num2Divide != 0) {
                       System.out.println("Result: " + divide(num1Divide, num2Divide));
                   } else {
                       System.out.println("Cannot divide by zero");
                   }
                   break;
               case "!":
                   System.out.println("Enter a value:");
                   double numberFactorial = scanner.nextDouble();
                   System.out.println("Result: " + factorial(numberFactorial));
                   break;
               default:
                   System.out.println("Invalid operation");
           }
       }
       scanner.close();
   }
   /**
    * add the Two values
    * @param a The first value
    * @param b The second value
    * @return The sum of a and b
    */
   public static double add(double a, double b) {
       return a + b;
   }
   /**
    * subtracts the two values
    * @param a The first value
    * @param b The second value
    * @return The value of a - b
    */
   public static double subtract(double a, double b) {
       return a - b;
   }
   /**
    * multiplies the two values
    * @param a The first value
    * @param b The second value
    * @return The result of a * b
    */
   public static double multiply(double a, double b) {
       return a * b;
   }
   /**
    * divides the two values
    * @param a The first value
    * @param b The second value
    * @return The value of a / b
    */
   public static double divide(double a, double b) {
       return a / b;
   }
   /**
    *  does the factorial of the value
    * @param n the value
    * @return the factorial of n
    */
   public static double factorial(double n) {
       if (n <= 1) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
}
