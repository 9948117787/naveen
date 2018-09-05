/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


public class Median
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.print((n+1)/2);
	}
}
