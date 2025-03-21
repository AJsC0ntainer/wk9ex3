import java.util.Scanner;

public class wk9ex3
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("WELCOME TO THE TEMPERATURE COMVERTER APP");
        System.out.println("=========================================");
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit = userInput.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        //System.out.println(String.format(%.0f, fahrenheit);
        //System.out.println(String.format(%.0f,fahrenheit) + " " + "F " + "degrees is equivalent to " + celsius + " C");

        System.out.println(String.format("%.0f", fahrenheit) + " F degrees is equivalent to " + String.format("%.2f", celsius));

        

        userInput.close();

        System.out.println("\nEnd of program!\n");
    }
}