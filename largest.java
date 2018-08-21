
import java.util.*;
import java.lang.*;
import java.io.*;
public class Largest
{
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int n1,n2,n3;
        n1=s.nextInt();
        n2=s.nextInt();
        n3=s.nextInt();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1);

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2);

        else
            System.out.println(n3);
    }
}
