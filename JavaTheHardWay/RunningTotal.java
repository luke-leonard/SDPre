import java.util.Scanner;

public class RunningTotal
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int current = 1, total = -1;

    System.out.print("Type a bunch of vales and Ill add them up. ");
    System.out.println("I'll stop when you type zero.");

    while ( current != 0)
    {
        total += current;
        System.out.println("The total so far is: " + total);
        System.out.print("Value: ");
        current = input.nextInt();
    }

    System.out.println("The final total is: " + total);
  }
}
