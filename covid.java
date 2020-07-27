/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class covid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
	  int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			int count=0;
			for(int i=1;i<n;i++){
				int diff=arr[i]-arr[i-1];
				if(diff>2){
					count++;
				}
			}
			if(count==0){
				System.out.println(n+" "+n);
			}
			else{
			int[] arr1=new int[count+2];
			arr1[0]=0;
			arr1[count+1]=n;
			int j=1;
			for(int i=1;i<n;i++){
				int diff1=arr[i]-arr[i-1];
				if(diff1>2){
					arr1[j]=i;
					j++;
				}
			}
			int max=0;
			int min=10;
			for(int i=1;i<count+2;i++){
				int diff2=arr1[i]-arr1[i-1];
				if(diff2>max){
					max=diff2;
				}
				if(diff2<min){
					min=diff2;
				}
			}
			System.out.println(min+" "+max);
		}
		}

	}
}
