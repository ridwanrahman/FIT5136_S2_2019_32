import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public Main()
    {
        System.out.println("This is where everything will start");
        System.out.println("I hope this thing goes to jayce");
        System.out.println("I hope this thing goes to anywhere");
        runProgram();
    }
    public void runProgram()
    {
        showMenu();
    }
    public void showMenu()
    {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print('\u000C');
        System.out.println("************************** WELCOME TO PRIME EVENTS *********************");        
        System.out.print(" *");
        System.out.print(" \t\t\t\t\t\t\t\t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tThis is an event management system that will contain");
        System.out.print("  \t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tthe list of the halls across Melbourne which may include");
        System.out.print(" \t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tspecial discounts.");
        System.out.print(" \t\t\t\t\t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print(" \t\t\t\t\t\t\t\t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tWith this system, customers can booking a dream hall");
        System.out.print(" \t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tfor their Big Days e.g. wedding ceremony, birthday party");
        System.out.print(" \t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tor kinds of anniversaries.");
        System.out.print(" \t\t\t\t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print(" \t\t\t\t\t\t\t\t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tJust simply following our navigation to start!!!");
        System.out.print("\t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print(" \t\t\t\t\t\t\t\t\t*");
        System.out.println("");
        System.out.print(" ************************************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("1. I'd like to see all the halls");
        System.out.println("2. I'd like to login to my account");
        System.out.println("3. I'd like to register");
        System.out.println("Enter the number for your choice: ");
        choice = takeIntInput();
        System.out.println(choice);
        switch(choice) {
            case 1:
                System.out.println("Taking you to see all halls");
                break;
            case 2:
                System.out.println("Taking you to the login page");
                break;
            case 3:
                System.out.println("Taking you to the registration page");
                break;
            default:
                System.out.println("Wrong choice!!!");
                showMenu();
        }
        
    }
    public int takeIntInput() {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("Insert amount:");
        try {
            return input.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            input.nextLine();
        }
    }
        
    }
}
