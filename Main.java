import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("simple calculator");

        System.out.print("enter first number: ");
        double num1 = input.nextInt(); 

        System.out.print("enter the second value: ");
        double num2 = input.nextInt();
        
        System.out.println("\nchoose an operation");
        System.out.println("+ Sum ");
        System.out.println(" * Multiplication ");
        System.out.println(" - Subtraction ");
        System.out.println(" / division ");
        System.out.println("enter your choise: ");

        char choice = input.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("result =" + (num1 + num2));
                
                break;

                case '-':
                System.out.println("result =" + (num1 - num2));

                break;

                case '*':
                    System.out.println("result =" + (num1 * num2));
                break;

                case '/':
                    System.out.println("result =" + (num1 / num2));
                    break;


            default:
                System.out.println("invalid operation");
        }

        input .close();

    }
}