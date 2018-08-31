import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays.*;
public class ArrayMin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.print(a[0]);
		
	}
}
