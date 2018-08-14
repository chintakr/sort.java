/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,a=1,b=1,c;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(i=1;i<n;i++)
		{
    			c=a+b;
			System.out.print(" "+c);
	        a=b;
	        b=c;
	
	
		}
	}
}
