import java.util.*;
import java.lang.*;
import java.io.*;
public class leap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		  int year=s.nextInt();
        boolean leap = false;

        if(year % 4 == 0)
        { 
        	leap=true;
        }
        if(leap)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
	
