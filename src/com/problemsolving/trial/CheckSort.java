package com.problemsolving.trial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckSort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"AAA", 50.00));
        studentList.add(new Student(3,"BBB", 40.00));
        studentList.add(new Student(4,"CCC", 30.00));
        studentList.add(new Student(2,"DDD", 20.00));

        Collections.sort(studentList);
        for(Student st: studentList){
            System.out.println(st);
        }
    }
}

class Student implements Comparable<Student>{
    int roll;
    String name;
    double marks;

    public Student() {
    }

    public Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student st){
        return (st.roll- this.roll);
    }

    public String toString(){
        return "Roll: "+this.roll+" Name: "+this.name+" Marks: "+this.marks;
    }
}
