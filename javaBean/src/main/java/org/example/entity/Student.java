package org.example.entity;


import java.util.Collections;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(height, student.height) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}

                             
