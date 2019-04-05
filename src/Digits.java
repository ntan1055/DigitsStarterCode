import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {
        //implemented in part (a)
        digitList = new ArrayList<Integer>();
        
        if(num == 0)
        {
            digitList.add(num);
        }
        
        while(num > 0)
        {
            int digit = num % 10;
            digitList.add(0, digit);
            num = num / 10;
        }
    }
    public boolean isStrictlyIncreasing()
    {
        //implemented in part (b)
    }
    
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
