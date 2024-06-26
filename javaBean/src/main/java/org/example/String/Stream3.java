package org.example.String;

import org.example.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        Student student1=new Student("蜘蛛精",26,172.5);
        Student student2=new Student("蜘蛛精",26,172.5);
        Student student3=new Student("紫霞",23,167.6);
        Student student4=new Student("白晶晶",25,169.0);
        Student student5=new Student("牛魔王",35,183.3);
        Student student6=new Student("牛夫人",34,168.5);

        Collections.addAll(students,student1,student2,student3,student4,student5,student6);
        System.out.println(students);
        //1.计算出身高超过168的学生有几个人
        System.out.println(students.stream().filter(s -> s.getHeight() > 168).count());

        //找出身高最高的学生对象，并输出
        System.out.println("找出身高最高的学生对象，并输出");
        System.out.println(students.stream().max((s1, s2) -> Double.compare(s1.getHeight(), s2.getHeight())).get());
        System.out.println("第二种");
//        students.stream().sorted((o1,o2)->Double.compare(o2.getHeight(),o1.getHeight())).limit(1).forEach(System.out::println);

        //找出身高最矮的学生对象，并输出
        System.out.println("找出身高最矮的学生对象，并输出");
        System.out.println(students.stream().min((s1, s2) -> Double.compare(s1.getHeight(), s2.getHeight())).get());

//        students.stream().sorted((o1,o2)->Double.compare(o2.getHeight(),o1.getHeight())).skip(students.size()-1).forEach(System.out::println);

        //找出身高超过170的学生对象，并放到一个新的集合中去返回
        System.out.println("找出身高超过170的学生对象，并放到一个新的集合中去返回");

        //流只能收集一次
        List<Student> collect = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toList());
        System.out.println(collect);
        Set<Student> collect1 = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toSet());
        System.out.println(collect1);
//        students.stream().filter(s->s.getHeight()>170).toList().forEach(System.out::println);

        //找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个map集合返回
        System.out.println("找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个map集合返回");
        Map<String, Double> collect2 = students.stream().filter(a -> a.getHeight() > 170).distinct().collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
        System.out.println(collect2);
//        students.stream().filter(s->s.getHeight()>170).map(s->{Map<String,Double> s1=new HashMap<>();
//            s1.put(s.getName(),s.getHeight());
//            return s1;
//        }).forEach(System.out::println);

        Student[] array = students.stream().filter(a -> a.getHeight() > 170).toArray(s->new Student[s]);
        System.out.println(Arrays.toString(array));


    }
}
