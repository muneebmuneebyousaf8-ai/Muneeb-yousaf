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
        System.out.println("  1 = Sum ");
        System.out.println("  2 = Subtraction ");
        System.out.println("  3 = Multiplication ");
        System.out.println("  4 = division ");
        System.out.println("enter your choise: ");

        char choice = input.next().charAt(0);

        switch (choice) {
            case '1':
                System.out.println("result =" + (num1 + num2));
                
                break;

                case '2':
                System.out.println("result =" + (num1 - num2));

                break;

                case '3':
                    System.out.println("result =" + (num1 * num2));
                break;

                case '4':
                    System.out.println("result =" + (num1 / num2));
                    break;


            default:
                System.out.println("invalid operation");
        }

        input .close();

    }
}