import java.util.*;
import java.lang.*;
import java.io.*;

public class vowelconsonant
{
    public static void main(String[] args)
    {
    	Scanner s=new Scanner (System.in);

        char ch = 'q';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println("Consonant");

    }
}
