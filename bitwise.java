/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/* Name of the class has to be "Main" only if the class is public. */
class bitwise
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int t=scan.nextInt();
		while(t-->0){
		long x=scan.nextLong();
		long y=scan.nextLong();
		long l=scan.nextLong();
		long r=scan.nextLong();
		// long total=0,total1=0;
		// if(x<y){
		// 	 total=x|y;
		// 	long x1=2*x;
		// 	 total1=x1|y;
		// }else{
		// 	 total=x|y;
		// 	long y1=2*y;
		// 	 total1=x|y1;
		// }
    // long max=(x&total)*(y&total);
		// long max1=(x&total1)*(y&total1);
		// if(max==max1){
		// 	if(total<total1){
		// 		System.out.println(total);
		// 	}else{
		// 		System.out.println(total1);
		// 	}
		// }
		// else if(max>max1){
		// 	System.out.println(total);
		// }else{
		// 	System.out.println(total1);
		// }
		long max=0,ans=0;
		for(long i=0;i<r;i++){
			long total=(x&i)*(y&i);
			// System.out.println(total);
			if(total>max){
				max=total;
				ans=i;
			}
		}
		System.out.println(ans);

		}
	}
	static class FastScanner {
			private int BS = 1<<16;
			private char NC = (char)0;
			private byte[] buf = new byte[BS];
			private int bId = 0, size = 0;
			private char c = NC;
			private double cnt = 1;
			private BufferedInputStream in;

			public FastScanner() {
					in = new BufferedInputStream(System.in, BS);
			}

			public FastScanner(String s) {
					try {
							in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
					}
					catch (Exception e) {
							in = new BufferedInputStream(System.in, BS);
					}
			}

			private char getChar(){
					while(bId==size) {
							try {
									size = in.read(buf);
							}catch(Exception e) {
									return NC;
							}
							if(size==-1)return NC;
							bId=0;
					}
					return (char)buf[bId++];
			}

			public int nextInt() {
					return (int)nextLong();
			}

			public int[] nextInts(int N) {
					int[] res = new int[N];
					for (int i = 0; i < N; i++) {
							res[i] = (int) nextLong();
					}
					return res;
			}

			public long[] nextLongs(int N) {
					long[] res = new long[N];
					for (int i = 0; i < N; i++) {
							res[i] = nextLong();
					}
					return res;
			}

			public long nextLong() {
					cnt=1;
					boolean neg = false;
					if(c==NC)c=getChar();
					for(;(c<'0' || c>'9'); c = getChar()) {
							if(c=='-')neg=true;
					}
					long res = 0;
					for(; c>='0' && c <='9'; c=getChar()) {
							res = (res<<3)+(res<<1)+c-'0';
							cnt*=10;
					}
					return neg?-res:res;
			}

			public double nextDouble() {
					double cur = nextLong();
					return c!='.' ? cur:cur+nextLong()/cnt;
			}

			public String next() {
					StringBuilder res = new StringBuilder();
					while(c<=32)c=getChar();
					while(c>32) {
							res.append(c);
							c=getChar();
					}
					return res.toString();
			}

			public String nextLine() {
					StringBuilder res = new StringBuilder();
					while(c<=32)c=getChar();
					while(c!='\n') {
							res.append(c);
							c=getChar();
					}
					return res.toString();
			}

			public boolean hasNext() {
					if(c>32)return true;
					while(true) {
							c=getChar();
							if(c==NC)return false;
							else if(c>32)return true;
					}
			}
	}
}
