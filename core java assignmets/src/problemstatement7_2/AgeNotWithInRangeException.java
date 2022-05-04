package problemstatement7_2;

public class AgeNotWithInRangeException extends Exception{


    public String toString()
    {
         return ("Age is not between 16 and 21. please ReEnter the Age");
    }
}
