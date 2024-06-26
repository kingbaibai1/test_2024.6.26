package org.example.Collection;

import org.example.entity.Student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class collectionTest9 {
    public static void main(String[] args) {
        Set<Student>student=new TreeSet<>();
        student.add(new Student("kaikai",1,2));
        student.add(new Student("chaochao",6,3));
        //由于student类中使用的是年龄作为比较，当年龄相同时会被移除
        student.add(new Student("feifei",6,4));
        student.add(new Student("wanwan",7,9));

        System.out.println(student);


        //TreeSet就近原则选择自己自带的比较器对象进行排序
//        Set<Student>student1=new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getHeight(),o2.getHeight());
//            }
//        });
        Set<Student>student1=new TreeSet<>((o1,o2)->{
            return Double.compare(o1.getHeight(),o2.getHeight());
        });
        student1.add(new Student("kaikai",1,2));
        student1.add(new Student("chaochao",6,3));
        student1.add(new Student("feifei",6,5));
        student1.add(new Student("wanwan",7,9));

        System.out.println(student1);
    }
}
