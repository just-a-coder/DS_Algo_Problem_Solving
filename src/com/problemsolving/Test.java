package com.problemsolving;

import java.sql.SQLOutput;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student(1, "A1");
        Student st2 = new Student(2, "A2");
        Student st3 = new Student(3, "A3");
        Student st4 = new Student(4, "A4");
        List<Student> studentList = new ArrayList<>();
        studentList.add(st4);
        studentList.add(st3);
        studentList.add(st1);
        studentList.add(st2);
        Collections.sort(studentList, new StudentComparator(Collections.reverseOrder()));
        for (Student st : studentList) {
            System.out.println(st.id +" : "+ st.name);
        }
    }
}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class StudentComparator implements Comparator<Student> {
    public StudentComparator(Comparator<Object> reverseOrder) {
    }

    public int compare(Student st1, Student st2) {
        return st1.id - st2.id;
    }
}