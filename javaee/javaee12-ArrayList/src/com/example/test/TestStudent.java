package com.example.test;

import com.example.domian.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student[] stuArr = new Student[3];
        stuArr[0]  = new Student("zhangsna",12);
        stuArr[1] = new Student("swe", 123);
        stuArr[2] = new Student("wwww", 345);

        for(int i=0 ;i<stuArr.length;i++){
            Student temp = stuArr[i];
            System.out.println(temp.getName()+temp.getAge());
        }

    }
}
