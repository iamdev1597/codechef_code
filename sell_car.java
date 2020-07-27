/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sell_car
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		long m=1000000007;
		while(t-->0)
		{
			int n=scan.nextInt();
			long[] arr=new long[n];

			for(int i=0;i<n;i++)
			{
				arr[i]=scan.nextLong();
			}

			long sum=0,f=0;
			int l=arr.length-1;
			Arrays.sort(arr);
      int sub=1;
			while(n-->0)
			{
			   if(arr[l]<=0)
				 {
			   	 arr[l]=0;
					 f=1;
			    	 break;
			   }
				 else
				 {
		     	 f+=arr[l];
					 sum=(sum+f)%m;
			     // f=f%m;
			     // sum+=f;
			     f=0;
			     //arr[l-1]=0;
			     l--;
					 if(l<0){
						 f=1;
						 break;
					 }
					 arr[l]=arr[l]-sub;
					 sub++;
			   // for(int i=0;i<l;i++)
			   // {
				 //    if(arr[i]==0)
				 //     {
					//      arr[i]=0;
				 //     }
				 //   else
				 //     {
					//      arr[i]=arr[i]-1;
				 //     }
			   // }
		   }
			 if(f==1){
				 break;
			 }
   	 }
			  System.out.println(sum);
		}
	}
}
