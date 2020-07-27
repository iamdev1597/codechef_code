/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cake
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String[] s=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int q=Integer.parseInt(s[1]);
			long[][] XY=new long[n][2];
     for(int i=0;i<n;i++){
			 String[] s1=br.readLine().split(" ");
			 XY[i][0]=Integer.parseInt(s1[0]);
			 XY[i][1]=Integer.parseInt(s1[1]);

		 }
			int l1=0,l2=0,l3=0;
			while(q-->0){
				String[] s2=br.readLine().split(" ");
				Long x=Long.parseLong(s2[0]);
				Long y=Long.parseLong(s2[1]);
				for(int i=0;i<n;i++){
					if(XY[i][0]==x&&XY[i][1]==y){
						for(int j=0;j<n;j++){
							if(XY[j][0]>x){
								l1++;
							}if(XY[j][0]<x){
								l2++;
							}if(XY[j][1]>y){
								l3++;
							}
						}
						break;
					}
			}
				long z=Math.min(l1,l2);
				long res=Math.min(z,l3);
				System.out.println(res);
			}
		}
	}
}
