import java.util.*;
class Employee
 {
  public static void main(String args[])
   {
    try (Scanner obj = new Scanner(System.in)) {
        for(int i=1;i<=5;i++)
        {
          System.out.println("Details of employee "+i);
          System.out.println("Enter the empno:");
          obj.nextInt();
          System.out.println("Enter the name of employee:");
          obj.next();
          System.out.println("phone number of employee:");
          obj.next();
        }
    }
   }
}
