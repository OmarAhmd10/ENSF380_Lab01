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
           case "add":
               System.out.println("Result: " + add(num1, num2));
               break;
           case "subtract":
               System.out.println("Result: " + subtract(num1, num2));
               break;
           case "multiply":
               System.out.println("Result: " + multiply(num1, num2));
               break;
           case "divide":
               if (num2 != 0) {
                   System.out.println("Result: " + divide(num1, num2));
               } else {
                   System.out.println("Cannot divide by zero");
               }
               break;
           case "factorial":
               System.out.println("Result: " + factorial((int) num1));
               break;
           case "pow":
               System.out.println("Result: " + power(num1, num2));
               break;
           case "sqrt":
               System.out.println("Result: " + sqrt(num1));
               break;
           case "log":
               System.out.println("Result: " + log(num1));
               break;
           case "log10":
               System.out.println("Result: " + log10(num1));
               break;
           case "sin":
               System.out.println("Result: " + sin(num1));
               break;
           case "cos":
               System.out.println("Result: " + cos(num1));
               break;
           case "tan":
               System.out.println("Result: " + tan(num1));
               break;
           default:
               System.out.println("Invalid operation");
               break;
       }
   }
   // Method for interactive mode
   public static void interactiveMode() {
       Scanner scanner = new Scanner(System.in);
       while (true) {
           System.out.println("Enter operation (add, subtract, multiply, divide, factorial, pow, sqrt, log, log10, sin, cos, tan, exit): ");
           String operation = scanner.next().toLowerCase();
           if (operation.equals("exit")) {
               break;
           }
           // reads the value based on what operation was inputed
           switch (operation) {
               case "add":
                   System.out.println("Enter the first value:");
                   double num1Add = scanner.nextDouble();
                   System.out.println("Enter the second value:");
                   double num2Add = scanner.nextDouble();
                   System.out.println("Result: " + add(num1Add, num2Add));
                   break;
               case "subtract":
                   System.out.println("Enter the first value:");
                   double num1Subtract = scanner.nextDouble();
                   System.out.println("Enter the second value:");
                   double num2Subtract = scanner.nextDouble();
                   System.out.println("Result: " + subtract(num1Subtract, num2Subtract));
                   break;
               case "multiply":
                   System.out.println("Enter the first value:");
                   double num1Multiply = scanner.nextDouble();
                   System.out.println("Enter the second value:");
                   double num2Multiply = scanner.nextDouble();
                   System.out.println("Result: " + multiply(num1Multiply, num2Multiply));
                   break;
               case "divide":
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
               case "factorial":
                   System.out.println("Enter a value:");
                   double numberFactorial = scanner.nextDouble();
                   System.out.println("Result: " + factorial((int) numberFactorial));
                   break;
               case "pow":
                   System.out.println("Enter the base value:");
                   double base = scanner.nextDouble();
                   System.out.println("Enter the exponent value:");
                   double exponent = scanner.nextDouble();
                   System.out.println("Result: " + power(base, exponent));
                   break;
               case "sqrt":
                   System.out.println("Enter a value:");
                   double valueSqrt = scanner.nextDouble();
                   System.out.println("Result: " + sqrt(valueSqrt));
                   break;
               case "log":
                   System.out.println("Enter a value:");
                   double valueLog = scanner.nextDouble();
                   System.out.println("Result: " + log(valueLog));
                   break;
               case "log10":
                   System.out.println("Enter a value:");
                   double valueLog10 = scanner.nextDouble();
                   System.out.println("Result: " + log10(valueLog10));
                   break;
               case "sin":
                   System.out.println("Enter a value(Degrees):");
                   double valueSin = scanner.nextDouble();
                   System.out.println("Result: " + sin(valueSin));
                   break;
               case "cos":
                   System.out.println("Enter a value(Degrees):");
                   double valueCos = scanner.nextDouble();
                   System.out.println("Result: " + cos(valueCos));
                   break;
               case "tan":
                   System.out.println("Enter a value(Degrees):");
                   double valueTan = scanner.nextDouble();
                   System.out.println("Result: " + tan(valueTan));
                   break;
               default:
                   System.out.println("Invalid operation");
                   break;
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
    * does the factorial of the value
    * @param n the value
    * @return the factorial of n
    */
   
   public static double power(double base, double exponent) {
       return Math.pow(base, exponent);
   }

   /**
    * The square root of a value
    * @param a The value
    * @return The square root of a
    */
   public static double sqrt(double a) {
       return Math.sqrt(a);
   }

   /**
    * The natural logarithm of a value
    * @param a The value
    * @return The natural logarithm of a
    */
   public static double log(double a) {
       return Math.log(a);
   }

   /**
    *  The base 10 logarithm of a value
    * @param a The value
    * @return The base 10 logarithm of a
    */
   public static double log10(double a) {
       return Math.log10(a);
   }

   /**
    * The sine of a value
    * @param a The value
    * @return The sine of a in radians
    */
   public static double sin(double a) {
       return Math.sin(a);
   }

   /**
    * The cosine of a value
    * @param a The value 
    * @return The cosine of a in radians
    */
   public static double cos(double a) {
       return Math.cos(a);
   }

   /**
    * Calculates the tangent of a value
    * @param a The value
    * @return The tangent of a in radians
    */
   public static double tan(double a) {
       return Math.tan(a);
   }
   // Factorial calculation with progress display
   public static long factorial(int num) {
       if (num < 0) {
           System.out.println("Factorial of negative number is undefined.");
           return 0;
       }
       return factorialHelper(num, num);
   }
   // factorial function will call this function for the progress display
   private static long factorialHelper(int originalNum, int num) {
       if (num <= 1) {
           System.out.print("\rCalculating factorial: 100%");
           return 1;
       }
      
       int progress = (int) (((originalNum - num + 1) / (double) originalNum) * 100);
       System.out.print("\rCalculating factorial: " + progress + "%");
       return num * factorialHelper(originalNum, num - 1);
       
   }
}


