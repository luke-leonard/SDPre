public class CreatingVariables
{
  public static void main(String[] args)
  {
    int x, y, age, radius;
    double seconds, e, checking, pi;
    String firstName, lastName, title, shapeName, units;

    x = 10;
    y = 400;
    age = 21;

    radius = 2;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    pi = 3.1415926535;

    firstName = "Luke";
    lastName = "Leonard";
    title = "Mr.";

    shapeName = "circle";
    units = "in^2";

    System.out.println( "The variable x contains " + x);
    System.out.println( "The value " + y + " is stored in the variable y.");
    System.out.println( "The experiment took " + seconds + " seconds.");
    System.out.println( "A fully irrational # is Euler's number: " + e);
    System.out.println( "Hopefuly you have more than $" + checking + "!");
    System.out.println( "My name's " + title + " " + firstName + " " + lastName);
    System.out.println( "A " + shapeName + " of radius " + radius + " has an area of " + ( pi * radius * radius) + units );
  }
}
