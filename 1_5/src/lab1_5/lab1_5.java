package lab1_5;

import java.lang.System;
import java.util.Scanner;

public class lab1_5 {
    public static void main(String[] args) {
        int n, result = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
