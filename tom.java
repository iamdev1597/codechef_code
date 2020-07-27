/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class tom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			long n=Long.parseLong(br.readLine());
			long m=0,x=0;
			if(n%2!=0)
			{
		      System.out.println(n/2);
	     }
			 else
			 {
				 m=n/2;
				 while(true){
					 n=n/2;
					 m=m/2;
					 if(n%2!=0){
						 x=m;
						 break;
					 }
				 }
				 System.out.println(x);
			 }
		}
	}
}
