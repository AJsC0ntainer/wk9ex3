//Import the Scanner class.
import java.util.Scanner;

public class wk9ex3
{
    public static void main(String[] args)
    {
        //Create a Scanner object.
        Scanner userInput = new Scanner(System.in);
        //Program Title.
        System.out.println("WELCOME TO THE TEMPERATURE COMVERTER APP");
        //Styling.
        System.out.println("=========================================");
        //Prompt the user to enter the temperature in fahrenheit.
        System.out.print("Enter the temperature in fahrenheit: ");
        //Declare a variable to store the user input.
        double fahrenheit = userInput.nextDouble();
        //Declare a variable to store the formula result.
        double celsius = (fahrenheit - 32) * 5/9;

        //System.out.println(String.format(%.0f, fahrenheit);
        //System.out.println(String.format(%.0f,fahrenheit) + " " + "F " + "degrees is equivalent to " + celsius + " C");
        //Display the result with 2 decimal places.
        System.out.println(String.format("%.0f", fahrenheit) + "F degrees is equivalent to " + String.format("%.2f", celsius)+"C");
        //Close the Scanner object.
        userInput.close();
        //End of program message.
        System.out.println("\nEnd of program!\n");

        //pushed to GitHub Wk9ex3 Repository.
    }
}