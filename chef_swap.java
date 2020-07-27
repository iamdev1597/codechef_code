import java.io.*;
import java.util.*;
import java.lang.*;
class chef_swap{
  public static void main(String[] args) throws java.lang.Exception{
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
      int n=scan.nextInt();
      long[] arr=new long[n];
      long[] arr1=new long[n];
      for(int i=0;i<n;i++){
        arr[i]=scan.nextLong();
      }
      for(int i=0;i<n;i++){
        arr1[i]=scan.nextLong();
      }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(arr[i]==arr1[j]){
          arr[i]=0;
          arr1[j]=0;
          continue;
        }
      }
    }
    Arrays.sort(arr);
    Arrays.sort(arr1);
      long count=0,c=0;
      int a=0,b=0;
      for(int i=0;i<n;i++){
        if(arr[i]>0||arr1[i]>0){
          count++;
        }
      }
      for(int i=0;i<n;i++){
        if(arr[i]>0){
          a=i;
          break;
        }
      }
      for(int i=0;i<n;i++){
      if(arr1[i]>0){
          b=i;
          break;
        }
      }
      int num=n-a;
      int num1=n-b;
      if(count==0){
        System.out.println(0);
      }else{
        int p1=0;
          for(int i=a;i<n-1;i=i+2){
               if(arr[i]!=arr[i+1]||arr1[i]!=arr1[i+1]){
               p1=1;
               break;
             }
            }
            if(p1==1||num%2!=0||num1%2!=0||num!=num1){
              System.out.println(-1);
            }else{
            int m=n-1;
            for(int i=a;i<n-1;i=i+2){
              if(arr[i]==arr[i+1]&&arr1[i]==arr1[i+1]){
                c+=Math.min(arr[i],arr1[m]);
                m=m-2;
              }
            }
            System.out.println(c);
          }
        }
    }
  }
}
