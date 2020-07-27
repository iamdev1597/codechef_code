/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Covid19
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int count=0;
			int n=scan.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
				if(arr[i]==1){
					arr[i]=i+1;
					count++;
				}
			}
			Arrays.sort(arr);
			int m=count-1;
			int l=n-1;
			String str="YES";
			while(m-->0){
				int diff=0;
				 diff=arr[l]-arr[l-1];
				if(diff<6){
					str="NO";
					break;
				}
				l--;
				if(l<1){
					break;
				}
			}
			System.out.println(str);

		}
		// your code goes here
	}
}
