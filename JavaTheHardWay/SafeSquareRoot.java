import java.util.Scanner;

public class SafeSquareRoot
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double x, y;
    String ready;

    System.out.println("You ready?");
    ready = input.next();
    while (!ready.equals("yes"))
    {
      System.out.println("Not good enough.");
      System.out.println("You ready?");
      ready = input.next();
    }



    System.out.print("Give me a number, I'll find it's square root.");
    System.out.print("(No negatives, please.)");
    x = input.nextDouble();

    while(x < 0 )
    {
        System.out.println("I won't take the square root of a negative.");
        System.out.print("\nNew number: ");
        x = input.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);

    input.close();
  }
}
