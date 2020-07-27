import java.io.*;
import java.util.*;
import java.lang.*;

class coders_legacy{

 public static void main(String[] args) throws java.lang.Exception
 {
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while(t-->0){
      int n=scan.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
      }
      int f=0;
      for(int i=0;i<n;i++){
        if(arr[i]%2!=0&&arr[i]!=1){
          for(int j=0;j<n;j++){
            if(arr[j]%arr[i]!=0){
              f=1;
              break;
            }
          }
          if(f==1){
            break;
          }
        }
      }
      if(f==1){
        System.out.println("NO");
      }else{
        System.out.println("YES");
      }
   }
 }
}
