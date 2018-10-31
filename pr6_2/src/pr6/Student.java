package pr6;

public class Student implements Comparable<Student>{
    int name;
    int gpa;
    public int getGPA(){
        return gpa;
    }
    public int compareTo(Student s){

        return gpa-s.getGPA();
    }
    public int getName(){
        return name;
    }
}
