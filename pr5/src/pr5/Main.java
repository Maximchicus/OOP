package pr5;

import java.lang.System;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("АККЕРМАН:");
        Scanner sc = new Scanner(System.in);
        int n, m;
        do{
            System.out.println("M:");
            m=sc.nextInt();
        }while(m<0);
        do{
            System.out.println("N:");
            n=sc.nextInt();
        }while(n<0);
        System.out.println(Rec.Akker(m, n));
        System.out.println("НЕЧЕТНОЕ:");
        do{
            System.out.println("N:");
            n=sc.nextInt();
        }while(n<0);
        System.out.println(Rec.Nech(n));
        System.out.println("СЛЕВА НАПРАВО:");
        do{
            System.out.println("N:");
            n=sc.nextInt();
        }while(n<0);
        System.out.println(Rec.LeftRight(n));
    }
}
