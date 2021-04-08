package hackerrank_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort {
    public static void main(String[] args){

        List<Student> studentList = new ArrayList<>( List.of(

        new Student(33, "Rumpa", 3.68),
        new Student(85, "Ashish", 3.85),
        new Student(56, "Samiha", 3.75),
        new Student(19, "Samara", 3.75),
        new Student(22, "Fahim", 3.76)
        ));

        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}


class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        if (this.cgpa ==  o.cgpa){
            if (this.getFname().equals(o.getFname())){
                if (this.getId() < o.getId()){
                    return 1;
                }else{
                    return -1;
                }
            }else{
                return this.getFname().compareTo(o.getFname());
            }
        }else if(this.cgpa < o.getCgpa()){
            return 1;
        }
        return -1;
    }
}
