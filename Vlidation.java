
/**
 * Write a description of class Vlidation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vlidation
{
    public boolean isVaild(String userInput)
    {
        try
        {
            Integer.parseInt(userInput);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public boolean isOutOfBound(int minimum, int maximum, int userInput)
    {
        if(userInput < minimum || userInput > maximum)
            return false;
        else
            return true;
    }
}
