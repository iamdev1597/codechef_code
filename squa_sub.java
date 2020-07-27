/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class squa_sub
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			long[] arr=new long[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextLong();
			}
			long p=1;
			int count=0;
			int i=0;
				for (int j=i; j<n; j++)
				{
			       p*=arr[j];
			        if(p%2!=0||p%4==0)
			          {
				           count++;
			          }
					 if(j==n-1)
					 {
						 i++;
						 j=i-1;
						 p=1;
					 }
					 if(i==n){
						 break;
					 }
			  }
			System.out.println(count);
		}
	}
}
