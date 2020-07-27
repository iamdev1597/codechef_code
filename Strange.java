/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Strange
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
    long x=scan.nextLong();
    long k=scan.nextLong();
    int m=0;
		int count=0;
    if(x==k)
		  {
        m=0;
      }
    else if(k==1&&x>1)
	  	{
        m=1;
      }
		else if(k==2)
		  {
				if(x%2==0){
					m=1;
				}
				for(int i=3;i<Math.sqrt(x);i+=2){
					if(x%i==0){
						m=1;
					}
				}
	    }
			else{
				while(x%2==0)
			   {
					 count++;
					 x /= 2;
			   }
			 for (int i = 3; i <= Math.sqrt(x); i+= 2)
			 {
					 while (x%i == 0)
					 {
							 count++;
							 x /= i;
					 }
			 }
			 if (x > 2)
			   {
					 count++;
				 }
			 if(count>=k)
			   {
						 m=1;
			   }
			}
		System.out.println(m);
    }
	}
}
