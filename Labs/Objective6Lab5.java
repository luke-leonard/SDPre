import java.util.Scanner;

public class Objective6Lab5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int selection;

    Boolean inMenu = true;
    while (inMenu)
    {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = input.nextInt();

      switch (selection)
      {
        case 1: System.out.println("Hello Human"); break;
        case 2: System.out.println("Pizza, Burgers, Chicken"); break;
        default: System.out.println("Goodbye");inMenu = false; break;
      }
    }
  }
}
