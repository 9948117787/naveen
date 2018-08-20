import java.util.*;
import java.lang.*;
import java.io.*;
public class alphbetornot
{ 
	public static void main(String[] args)
	{
             Scanner s=new Scanner(System.in);
        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + "  alphabet.");
        else
            System.out.println(c + " * is not an alphabet.");
    }
}
	
