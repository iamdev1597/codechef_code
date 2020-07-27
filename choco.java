/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class choco
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int f=0;
			int y=0,z=0;
			int count=0;
			int n=scan.nextInt();
			int x=scan.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
				if(arr[i]==1){
					f=1;
				}
			}
			if(f==1){
				System.out.println("Impossible");
			}
			else{
				Arrays.sort(arr);
					int p=0;
					for(int i=p;i<n;i++){
						if(i<x){
							arr[i]=-1;
						}else{
							arr[i]-=1;
						}
						if(arr[i]==1){
							f=1;
							break;
						}
						i=p+x-1;
						x=x+x;
					}
				if(f==1){
					System.out.println("Impossible");
				}
				else{
					System.out.println("Possible");
				}
			}
		}
	}
}
