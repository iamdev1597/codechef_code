import java.io.*;
import java.lang.*;
import java.util.*;
class tricky
{
  public static void main(String[] args) throws java.lang.Exception
  {
    Scanner scan= new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
      long a=scan.nextLong();
      long b=scan.nextLong();
      long c=scan.nextLong();
      long x=(c-b)/a;
      System.out.println(a*x+b);
    }
  }
}
