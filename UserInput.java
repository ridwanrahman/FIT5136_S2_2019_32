import java.util.Scanner;
/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class UserInput
     */
    public UserInput()
    {
        // initialise instance variables
        x = 0;
    }

    public String acceptStringInput(String displayMessage)
    {      
        Scanner in = new Scanner(System.in);
        System.out.print(displayMessage);
        String userInput = in.nextLine().trim();
        return userInput;             
    }
}
