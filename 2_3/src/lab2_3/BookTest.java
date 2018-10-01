package lab2_3;

import java.lang.System;
import java.util.*;

class Book{
    String title, author, genre;
    int numberOfPages;
    public void get(){
        System.out.println("Введите название книги: ");
        Scanner sc = new Scanner(System.in);
        title = sc.nextLine();
        System.out.println("Введите автора: ");
        author = sc.nextLine();
        System.out.println("Введите жанр: ");
        genre = sc.nextLine();
        System.out.println("Введите количество страниц: ");
        numberOfPages = sc.nextInt();
    }

    public void out(){
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Жанр: " + genre);
        System.out.println("Количество страниц: " + numberOfPages);
    }
    public void set(){
        Scanner sc = new Scanner(System.in);
        int n=-1;
        while(n!=0){
            out();
            System.out.println("Изменить:");
            System.out.println("1.Назавние");
            System.out.println("2.Автора");
            System.out.println("3.Жанр");
            System.out.println("4.Количество страниц");
            System.out.println("0.Выход");
            n = sc.nextInt();
            Scanner set = new Scanner(System.in);
            if(n==1) {
                System.out.println("Введите название книги: ");
                title = set.nextLine();
            }
            else if(n==2) {
                System.out.println("Введите автора: ");
                author = set.nextLine();
            }
            else if(n==3) {
                System.out.println("Введите жанр: ");
                genre = set.nextLine();
            }
            else if(n==4) {
                System.out.println("Введите количество страниц: ");
                numberOfPages = set.nextInt();
            }
            else if(n==0){}
            else System.out.println("Неправильный ввод");
        }
    }


}

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.get();
        b1.set();
    }
}
