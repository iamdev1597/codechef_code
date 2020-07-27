/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chef_cards
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int chef=0,morty=0,draw=0;
			while(n-->0){
				long a=scan.nextLong();
				long b=scan.nextLong();
				long sum=0,sum1=0;
				if(a<10){
					sum=a;
				}else if(a>=10){
					while(a!=0){
					long rem=a%10;
					a=a/10;
					sum+=rem;
				}
				}
				else if(b<10){
					sum1=b;
				}else if(b>=10){
					while(b!=0){
						long rem1=b%10;
						b=b/10;
						sum1+=rem1;
					}
				}
				if(sum>sum1){
					chef++;
				}else if(sum<sum1){
					morty++;
				}else{
					draw++;
				}
			}
			if(chef>morty){
				System.out.println(0+" "+chef);
			}else if(chef<morty){
				System.out.println(1+" "+morty);
			}else{
				System.out.println(2+" "+chef);
			}
		}
	}
}
