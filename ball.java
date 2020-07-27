/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ball
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
    long x=scan.nextLong();
    long y=scan.nextLong();
    if(x<1||y<1){
    System.out.println("NO");
    }
    else{
    System.out.println("YES");
    }
    }
	}
}
