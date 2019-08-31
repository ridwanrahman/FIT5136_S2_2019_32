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
        System.out.println("4. Exit");
        boolean choiceLoop = false;
        while(choiceLoop == false) {
            choice = takeIntInput();
            switch(choice) {
            case 1:
                hallView();                
                break;
            case 2:
                System.out.println("Taking you to the login page");
                break;
            case 3:
                System.out.println("Taking you to the registration page");
                break;
            case 4:
                exit();
                choiceLoop = true;
                break;
            default:
                System.out.println("Wrong choice!!!");
                showMenu();
            }
        }
    }
    
    public int takeIntInput() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number for your choice: ");
            try {
                return input.nextInt();
            }
            catch (java.util.InputMismatchException e) {
                input.nextLine();
            }
        }        
    }
    
    public void exit() {
        System.out.println("Thank you for using Prime Events. Have a great day!");
        System.exit(1); 
    }
    
    public void hallView()
    {
        System.out.print('\u000C');
        System.out.println("Taking you to see all halls");
        System.out.println("");
        System.out.println("");
        System.out.println("4: Go back");
        boolean hallViewMenuLoop = false;
        while(hallViewMenuLoop == false) {
            int choice = takeIntInput();
            switch(choice) {
                case 4:
                    hallViewMenuLoop = true;
                    break;                                                    
            }
        }
        showMenu();                
    }
}