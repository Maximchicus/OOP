package pr6;

import java.lang.System;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Введите количество студентов: ");
        n = sc.nextInt();
        Student s[] = new Student[n];
        System.out.println("Введите баллы: ");
        for(int i=0; i<s.length; i++){
            s[i] = new Student();
            s[i].gpa = sc.nextInt();
        }
        System.out.println("Было");
        for(int i=0; i<s.length; i++){
            System.out.println(s[i].gpa);
        }
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.quickSort(s, 0, s.length-1);
        System.out.println("Стало");
        for(int i=0; i<s.length; i++){
            System.out.println(s[i].gpa);
        }

    }

}
