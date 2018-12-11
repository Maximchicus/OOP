package lab7;

import java.util.*;
import java.lang.System;

public class Main {

    public static void main(String[] args) {
        Students s = new Students();
        int n;
        do{
            System.out.println("Выберите действие: ");
            System.out.println("1. добавить");
            System.out.println("2. удалить");
            System.out.println("3. количество студентов");
            System.out.println("4. список студентов");
            System.out.println("0. выход");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch (n){
                case 1:
                    s.addStudent();
                    break;
                case 2:
                    s.deleteStudent();
                    break;
                case 3:
                    s.numberOfStudents();
                    break;
                case 4:
                    s.out();
                    break;
            }

        } while(n!=0);

    }

}
class Students{
    LinkedList<String> students = new LinkedList<>();
    void addStudent(){
        System.out.print("Студент: ");
        Scanner s = new Scanner(System.in);
        students.add(s.nextLine());
    }
    void deleteStudent(){
        if(students.isEmpty()){
            System.out.println("В списке нет студентов");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Студент: ");
        String st = sc.nextLine();
        if(students.contains(st)){
            students.remove(st);
        }
        else System.out.println("В списке нет такого студента");
    }
    void numberOfStudents(){
        System.out.println("В списке "+students.size()+" студента");
    }
    void out(){
        if(students.isEmpty()){
            System.out.println("В списке нет студентов");
            return;
        }
        System.out.println("Студенты:");
        for(String s: students){
            System.out.println(s);
        }
    }

}
