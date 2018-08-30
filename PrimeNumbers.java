import java.util.*;
import java.lang.*;
import java.io.*;
public class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       Scanner s=new Scanner(System.in);
       int n1=s.nextInt();
       int n2=s.nextInt();
       String  primeNumbers = "";
 
       for (i = n1; i <= n2; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
 
       System.out.print(primeNumbers+" ");
   }
}
