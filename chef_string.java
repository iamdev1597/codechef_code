/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chef_string
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
			int sum=0;
			for(int i=1;i<n;i++){
				sum+=Math.abs(arr[i]-arr[i-1])-1;
			}
			System.out.println(sum);
		}
	}
}
