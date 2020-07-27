/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t--!=0)
		{
		    String s=in.next();
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int x=s.length();
		    int h=0,k=0;
		    for(int i=0;i<x;i++)
		    {
		        if(s.charAt(i)=='A')
		        h=i;
		        else if(s.charAt(i)=='B')
		        k=i;
		    }
		    int m=h;
		    int n=k;
		    while(m<n && m+a<x-1 && n-b>0)
		    {
		        m=m+a;
		        n=n-b;
		    }
		    if(m==n)
		    System.out.println("unsafe");
		    else
		    System.out.println("safe");
		}
	}
}
