import java.util.*;
import java.lang.*;
import java.io.*;
public class NumberDigits 
{
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
        int count=0,num=s.nextInt();

        while(num != 0)
        {
            num /= 10;
            ++count;
        }

        System.out.println(count);
    }
}
