import java.util.*;
import java.lang.*;
import java.io.*;
class Odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		for (int i = n1+1; i <=n2; i++)
		{
			if (i % 2 != 0)
			{
				System.out.print(i + " ");
			}
		}
	}
}

		
