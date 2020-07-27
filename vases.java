/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vases
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int m=scan.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			int s=0;
      int c1=0;
			if(2*n==m){
				c1=1;
			}
			if(m==0)
			{
	     	boolean v[]=new boolean[n];
		      for(int i=0;i<n;i++){
			       int j=i,c=0;
			        while(!v[j]){
				          v[j]=true;
				          j=arr[j]-1;
				          c++;
			          }
			        if(c!=0)
				         s+=c-1;
		      }
	   	  System.out.println(s);
	     }
		 else
		 {
			 while(m-->0){
				 int f=0,f1=0;
				 int x=scan.nextInt();
				 int y=scan.nextInt();
				 for(int i=0;i<n;i++){
				    if(arr[i]==x){
				       f=x-1;
					  }
						if(arr[i]==y){
						   f1=y-1;
						}

					int jump=arr[f];
					arr[f]=arr[f1];
					arr[f1]=jump;
				}
				}
				// int c1=0;
				//  for(int i=0;i<n;i++)
				//  {
				// 	 if(check[i]!=n-1||check[i]>n-1)
				// 	 {
				// 		  c1=1;
				// 		 break;
				// 	 }
				//  }
				//  if(c1==1){
				if(c1==0){
						 boolean v[]=new boolean[n];
						 for(int i=0;i<n;i++){
							 int j=i,c=0;
							 while(!v[j]){
								 v[j]=true;
								 j=arr[j]-1;
								 c++;
								}
									 if(c!=0)
											s+=c-1;
							 }
								System.out.println(s);
						}else{
							System.out.println(0);
						}

					 // }
					 // else
					 // {
						//  System.out.println(0);
					 // }
		 }
		}
	}
}
