/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ada_king
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int k=scan.nextInt();
			char[][] arr=new char[8][8];
			char[][] arr1=new char[8][8];
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					arr1[i][j]='.';
				}
			}
			int count=0,c=0,n=0,m=0,f=0;
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					 if(count==k){
						arr[i][j]='X';
						c++;
						if(c==8&&k%8==0){
							n=i;
							m=j;
							f=1;
							break;
						}
						if(c==9){
							n=i;
							m=j;
							f=1;
							break;
						}
					}else{
					arr[i][j]='.';
					n=i;
					m=j;
					count++;
				}
				}
				if(f==1){
					break;
				}
			}
			int p=0;
		  if(n==1){
				for(int i=0;i<=n;i++){
					for(int j=0;j<=m;j++){
						arr1[i][j]=arr[i][j];
					}
				}
			}else{
				for(int i=0;i<8;i++){
					for(int j=0;j<8;j++){
							arr1[i][j]=arr[i][j];
							if(i==n&&j==m){
								p=1;
								break;
							}
					}
					if(p==1){
						break;
					}
				}
			}
			arr1[0][0]='O';
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					System.out.print(arr1[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
