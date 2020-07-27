import java.util.*;
import java.io.*;
import java.lang.*;
class event{
  public static void main(String[] args) throws java.lang.Exception{
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
      int n=scan.nextInt();
      String s=scan.next();
      HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
      for(int i=0;i<n;i++){
        if(hm.containsKey(s.charAt(i))){
          hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }else{
          hm.put(s.charAt(i),1);
        }
      }
      String flag="YES";
      for(Map.Entry<Character,Integer> e:hm.entrySet()){
          if(e.getValue()%2!=0){
            flag="NO";
            break;
          }
      }
      System.out.println(flag);
    }
  }
}
