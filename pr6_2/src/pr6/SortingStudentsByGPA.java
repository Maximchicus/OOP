package pr6;

import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.compareTo(b);
    }
    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student x = new Student();
        x.gpa = array[middle].getGPA();
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        do{
            while (compare(array[i], x) > 0)
                i++;

            while (compare(array[j], x) < 0)
                j--;

            if (i <= j) {//меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }while (i <= j);

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
