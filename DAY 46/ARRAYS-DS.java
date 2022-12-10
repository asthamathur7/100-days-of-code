import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution{
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int[] inputarr=new int[arr_size];
        int temp = arr_size-1;
        int[] reversedarr= new int[arr_size];
        for (int i=0; i<arr_size;i++){
            int num = sc.nextInt();
            inputarr[i]=num;
            reversedarr[temp]=num;
            temp--;
        }
        for (int i=0; i<arr_size;i++){
            System.out.print(reversedarr[i]+" ");
        }


    }
}
