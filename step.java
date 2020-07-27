import java.util.*;
import java.io.*;
import java.lang.*;
class step{
  public static void main(String[] args) throws java.lang.Exception{
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
    while(t-->0){
    int n=scan.nextInt();
    int m=scan.nextInt();
    int x=scan.nextInt();
    int y=scan.nextInt();
    int sum=0;
    if(n==1&&m==1){
      if(x<y){
        sum+=x+1;
      }else{
        sum+=y+1;
      }
    }else if(n==1&&m>3||n>3&&m==1){
      while(true){
        if(x*3>y){
          if(x+(x-1)*2<=y){
            sum+=(n*m)/2;
          }
        }else{
          sum+=n*m;
        }
        x--;
        if(x<0){
          break;
        }
      }
    }
    else if(n==2||m==2){
      while(true){
        if(x*2>y){
          if(x+(x-1)<=y){
            sum+=(n*m)/2;
          }
        }else{
          sum+=n*m;
        }
        x--;
        if(x<0){
          break;
        }
      }
    }
    else{
    while(true){
      if(x*3>y){
       if(x+(x-1)*2<=y){
         sum+=(n*m)/2;
       }
     }
      else{
        sum+=n*m;
      }
      x--;
      if(x<0){
        break;
      }
    }
  }
    System.out.println(sum);

    }
  }
}
