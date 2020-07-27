/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class triplesort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int k=scan.nextInt();
			int[] arr=new int[n];
			int[] arr1=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
				arr1[i]=arr[i];
			}
			Arrays.sort(arr1);
			int count=0;
			for(int i=0;i<n;i++){
				if(arr1[i]!=arr[i])
				 count++;
			}
     if(count>3*k){
			 System.out.println(-1);
		 }
		 else{
			 int[] num=new int[count];
			 int[] nm=new int[count];
			 int j=0;
			 for(int i=0;i<n;i++){
				 if(arr1[i]!=arr[i]){
					 num[j]=arr[i];
					 nm[j]=num[j];
					 j++;
				 }
			 }
			 Arrays.sort(nm);
			 int i=0,f=0,f1=0;
			 int[] num1=new int[3];
			 while(true){
				 f1++;
				 num1[0]=num[i];
				 num1[1]=num[i+1];
				 num1[2]=num[i+2];
				 Arrays.sort(num1);
				 num[i]=num1[0];
				 num[i+1]=num1[1];
				 num[i+2]=num1[2];
				 i=i+3;
				 if(i>=count){
					 for(int k=0;k<count;k++){
						 if(num[k]!=num1[k])
						 f=1;
					 }
				 }
			 }
			 // Arrays.sort(num);
			 // int l=count/3;
			 // System.out.println(l);
			 // for(int i=0;i<count;i+=3){
				//  System.out.println(num[i]+" "+num[i+1]+" "+num[i+2]);
			 // }
		 }
		}
	}
}
