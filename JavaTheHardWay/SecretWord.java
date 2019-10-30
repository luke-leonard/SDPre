import java.util.Scanner;

public class SecretWord
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String secret = "please", guess;

    String secret2 = "hush";
    System.out.print("What's the secret word? ");
    guess = input.next();

    if (guess.equals(secret)||guess.equals(secret2))
    {
      System.out.println("That's correct!");
    }
    else
    {
      System.out.println("No, the secret word isn't \"" + guess + "\".");
    }

    if (guess == secret)
    {
      System.out.println("(This will never evr show, no matter what.)");
    }


  }
}
