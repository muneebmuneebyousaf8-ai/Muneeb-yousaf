import java.util.Scanner;

public class hello {

  public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter name :");
      String name = input.nextLine();
      System.out.println("enter your roll no :");
      int rollno = input.nextInt();
      

      System.out.println("english :");
      int english = input.nextInt();
      System.out.println("math :");
      int math = input.nextInt();
      System.out.println("physics");
      int physics = input.nextInt();
      System.out.println("chemistry :");
      int chemistry = input.nextInt();
      System.out.println("urdu :");
      int urdu = input.nextInt();

      int sum = english + math + physics + chemistry + urdu;
      System.out.println("total marks :" + sum);
      double percentage = (sum / 500.0) * 100;
      System.out.println("percentage" + percentage);

      if (percentage >= 90) {
        System.out.println("grade :A");
      }
      else if (percentage >= 80) {
          System.out.println("grade B");
      }  
      else if (percentage >= 70) {
        System.out.println("grade c");
          
         }else if (percentage >=60) {
          System.out.println("grade d");
          
         } else if (percentage >=50) {
          System.out.println("grade e");
          
         } else{
          System.out.println("pass");
          
        }
        
      }

    }
  }

