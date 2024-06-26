package org.example.Collection;

import org.example.entity.Student;

public class collectionTest7 {
    public static void main(String[] args) {
        Student s1=new Student("baibai",23,188.8);
        Student s2=new Student("duoyu",18,168.8);

        int i = s1.hashCode();
        System.out.println(i);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String str1=new String("abc");
        String str2=new String("acD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}
