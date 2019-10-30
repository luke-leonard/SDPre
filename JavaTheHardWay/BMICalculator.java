import java.util.Scanner;

public class BMICalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double f,in, lb, bmi;
    double m,kg;

    System.out.print("Your height(feet only): ");
    f = keyboard.nextDouble();

    System.out.print("Your height(inches only): ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lb = keyboard.nextDouble();

    in = in + (f * 12);
    m = in * 0.0254;
    kg = lb * 0.453592;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi);
  }
}
