import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 public static PerformOperation isOdd(){
      return evenOdd;
 }
 public static PerformOperation isPrime() {
    return prime;
}
public static PerformOperation isPalindrome() {
    return palindrome;
}
public static PerformOperation evenOdd = ((num)->(num % 2 != 0) ? true:false);
public static PerformOperation palindrome  =(num)->{
     String number=Integer.toString(num);
     StringBuilder input1 = new StringBuilder();
     input1.append(number);
     input1.reverse();
     int rslt=Integer.parseInt(input1.toString());
     if (num==rslt){
         return true;
     }else{return false;}
};
public static PerformOperation prime  =(num)->{
    boolean flag=true;
      for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = false;
        break;
      }
    }
    return(flag);
    
};
}
public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
