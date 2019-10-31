import java.util.Scanner;

public class EnterPIN
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int pin,entry;
    String password, passwordEntry;

    pin = 12345;
    password = "password";

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("ENTER YOUR PASSWORD:");
    passwordEntry = input.next();


    while(!passwordEntry.equals(password))
    {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
       passwordEntry = input.next();
    }


    System.out.print("ENTER YOUR PIN:");
    entry = input.nextInt();

    while(entry != pin)
    {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = input.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
