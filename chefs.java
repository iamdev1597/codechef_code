/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chefs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int count=0;
			String s=br.readLine();
			int n=s.length();
			char[] arr=new char[n];
			for(int i=0;i<n;i++){
		   arr[i]=s.charAt(i);
			}
			for(int i=0;i<n-1;i=i+2){
				if(arr[i]=='x'&&arr[i+1]=='y'){
					count++;
				}
				else if(arr[i]=='y'&&arr[i+1]=='x'){
					count++;
				}
				else if(arr[i]=='x'&&arr[i+1]=='x'){
					i--;
				}
				else if(arr[i]=='y'&&arr[i+1]=='y'){
					i--;
				}
			}
			System.out.println(count);
		}
	}
}
