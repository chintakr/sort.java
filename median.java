/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,j,k,m;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[i])
				{
					k=a[i];
					a[i]=a[j];
					a[j]=k;
				}
			}
		}
		if((n%2)==0)
		{
			m=((a[n/2]+a[(n+1)/2])/2);
		}
		else
		{
			m=a[n/2];
		}
		
		System.out.println(m);
	}
}
