/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class bounce
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
    long n=scan.nextLong();
		int i=0,x=0;
	    while(true){
				long m=(long)Math.pow(2,i)*2;
				if(m>=n){
					x=i;
					break;
				}
				m=0;
				i++;
			}
			if(x==0){
				System.out.println(0);
			}else{
				System.out.println(x-1);
			}
    }
	}
}
