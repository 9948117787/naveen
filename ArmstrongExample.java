import java.util.*;
import java.lang.*;
import java.io.*;
public class ArmstrongExample{  
  public static void main(String[] args)  {
  	Scanner s=new Scanner(System.in);
    int c=0,a,temp;  
    int n1=s.nextInt();
    int n2=s.nextInt();
    for(int i=n1;i<=n2;i++)
   { int n=i;
     temp=i;
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
     System.out.print(c+" ");
    c=0;

   }  
  }
}  
