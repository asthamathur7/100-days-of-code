import java.io.*;
import java.util.*;

public class Solution {
    static{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n > 0 && m > 0){
            System.out.println(m * n);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {}
}
