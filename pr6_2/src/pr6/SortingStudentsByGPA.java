package pr6;

public class SortingStudentsByGPA implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.compareTo(b);
    }

}
