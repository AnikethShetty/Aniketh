import java.util.Scanner;
public class calculation
{
  public static void main(String[] args)
  {
    float a, b, c;
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for division\nEnter 4 for division");
    n = sc.nextInt();
    switch(n)
    {
      case 1:
      System.out.println("Enter 2 numbers:");
      a = sc.nextFloat();
      b = sc.nextFloat();
      c = a + b;
      System.out.println("Sum: ");
      break;
      case 2:
      System.out.println("Enter 2 numbers:");
      a = sc.nextFloat();
      b = sc.nextFloat();
      c = a - b;
      System.out.println("Difference: ");
      break;
      case 3:
      System.out.println("Enter 2 numbers:");
      a = sc.nextFloat();
      b = sc.nextFloat();
      c = a * b;
      System.out.println("Product: ");
      break; 
      case 4:
      System.out.println("Enter 2 numbers:");
      a = sc.nextFloat();
      b = sc.nextFloat();
      c = a / b;
      System.out.println("Quotient: ");
      break;
      defaut:
      System.out.println("Invalid choice");
    }
  }
}