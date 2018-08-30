import java.util.*;
import java.lang.*;
import java.io.*;
public class Factorial
{  
 public static void main(String args[])
 {   
 	Scanner s=new Scanner(System.in);
  int i,fact=1;
  int number=s.nextInt();//It is the number to calculate factorial    
  for(i=1;i<=number;i++)
  {    
      fact=fact*i;    
  }    
  System.out.print(fact);    
 }  
}  
