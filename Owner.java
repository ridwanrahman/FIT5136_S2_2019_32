
/**
 * Write a description of class Owner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Owner
{
    public int chooseInput()
    {
        UserInput input = new UserInput();
        Vlidation check = new Vlidation();
        String numberOfChoice = input.acceptStringInput("Please enter your choice:  ");
        
        while(check.isVaild(numberOfChoice) == false)
        {
            numberOfChoice = input.acceptStringInput("Please enter number:  ");
        }
        
        return Integer.parseInt(numberOfChoice);
    }
    
    public void menu()
    {
        System.out.print('\u000C');
        System.out.println(" ************************** WELCOME TO PRIME EVENTS *********************");        
        System.out.print(" *");
        System.out.print("\t\t\t\t\t\t\t\t\t*");
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
        System.out.print("\tPrime Event System allows hall owners to rent their");
        System.out.print(" \t\t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tproperties as an event venue for those who want to have");
        System.out.print(" \t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\ta Big Day, e.g. wedding ceremony, birthday party or any");
        System.out.print(" \t*");
        System.out.println("");
        System.out.print(" *");
        System.out.print("\tanniversary.");
        System.out.print(" \t\t\t\t\t\t\t*");
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
        System.out.println("1. I'd like to share my hall.");
        System.out.println("2. I want to manage my existing orders.");
        System.out.println("3. Exit");
        
        int choice = chooseInput();
        switch(choice)
        {
            case 1: createHall(); break;
            case 2: mangeOrders(); break;
            case 3: exit(); break;
            default: menu(); 
        }
    }
    
    public void createHall()
    {
        System.out.print('\u000C');
        System.out.println("You can create the hall here");
        System.out.println("");
        System.out.println("");
        System.out.println("4: Go back");
        switch(chooseInput())
        {
            case 4: menu(); break;
            default: createHall();
        }
    }
    
    public void mangeOrders()
    {
        System.out.print('\u000C');
        System.out.println("You can manage halls here");
        System.out.println("");
        System.out.println("");
        System.out.println("4: Go back");
        switch(chooseInput())
        {
            case 4: menu(); break;
            default: mangeOrders();
        }
    }
    
    public void exit() {
        System.out.println("Thank you for using Prime Events. Have a great day!");
        System.exit(1); 
    }
}
