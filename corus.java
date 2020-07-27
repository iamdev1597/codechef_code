/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class corus
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
		  int q=scan.nextInt();
		  String s=scan.next();
			char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			int[] ch1=new int[26];
			for(int i=0;i<26;i++){
				for(int j=0;j<n;j++){
					if(ch[i]==s.charAt(j))
						ch1[i]+=1;
				}
			}
			while(q-->0){
				long c=scan.nextLong();
				int count=0;
				for(int i=0;i<26;i++){
					if(ch1[i]>c){
						count+=ch1[i]-c;
					}
				}
				System.out.println(count);
			}
		}
	}
}
