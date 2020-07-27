/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class unit_gcd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();

		while(t-->0){

			long n=scan.nextLong();

			if(n==1){

				System.out.println(1);
				System.out.println(1+" "+1);
			}

			else if(n==2){
				System.out.println(1);
				System.out.println(2+" "+1+" "+2);
			}

			else if(n==3){
				System.out.println(1);
				System.out.println(3+" "+1+" "+2+" "+3);
			}

			else{

				if(n%2==0){
					n=n/2;
					System.out.println(n);
					System.out.println(3+" "+1+" "+2+" "+3);
					  n=n-1;
					  int i=4;
					  int j=5;
					while(n-->0){
					   if(n==0){
                System.out.println(1+" "+i);
					    }
						 else{
						    System.out.println(2+" "+i+" "+j);
					      i=i+2;
					      j=j+2;
							}
					  }
				}else{
					n=n/2;
					System.out.println(n);
					System.out.println(3+" "+1+" "+2+" "+3);
					   n=n-1;
					   int i=4;
					   int j=5;
					while(n-->0){
						 System.out.println(2+" "+i+" "+j);
						   i=i+2;
						   j=j+2;
					  }
				 }
			}
			}
		}
	}
