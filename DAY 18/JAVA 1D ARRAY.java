import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.collectors.joining;

public class Solution {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a[] = new int [n];
    for(int i = 0;i<n;i++)
    {
        a[i] = scan.nextInt();
    }
    scan.close();

    // Prints each sequential element in array a
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
}
}
