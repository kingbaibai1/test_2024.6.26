package org.example.String;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Double> scores=new ArrayList<>();
        Collections.addAll(scores,88.5,100.0,60.0,99.0,99.6,25.0);
        //1.需求找出成绩大于等于60的数据，并升序排序，再输出
        Stream<Double> stream = scores.stream();
        stream.filter(e->e>60.0
        ).sorted().forEach(e->
            System.out.println(e));

        List<Student>students=new ArrayList<>();
        Student student1=new Student("蜘蛛精",26,172.5);
        Student student2=new Student("蜘蛛精",26,172.5);
        Student student3=new Student("紫霞",23,167.6);
        Student student4=new Student("白晶晶",25,169.0);
        Student student5=new Student("牛魔王",35,183.3);
        Student student6=new Student("牛夫人",34,168.5);
        Collections.addAll(students,student1,student2,student3,student4,student5,student6);
        //找出年龄大于等于23且年龄小于等于30岁的学生，并按照年龄降序排序
        students.stream().filter(e->e.getAge()>=23&&e.getAge()<=30).sorted((o1,o2)->
            o2.getAge()- o1.getAge()).forEach(e->
            System.out.println(e));
        //取出身高最高的三名学生，并输出
        System.out.println("取出身高最高的三名学生，并输出");
        students.stream().sorted((o1,o2)->(int)(o1.getHeight()- o2.getHeight()));
        //取出身高倒数的2名学生，并输出
        System.out.println("取出身高倒数的2名学生，并输出");
        students.stream().sorted((o1,o2)->Double.compare(o2.getHeight(),o1.getHeight())).skip(students.size()-2).forEach(e-> System.out.println(e));

        //找出身高超过168的学生叫什么名字，要求去除重复的名字，再输出
        System.out.println("找出身高超过168的学生叫什么名字，要求去除重复的名字，再输出");
        students.stream().filter(e->e.getHeight()>168).map(s->s.getName()).distinct().forEach(System.out::println);

        //distinct去重复，自定义类型的对象，（若要认为重复，需要重写equals和hashCode）
        students.stream().filter(s->s.getHeight()>168).distinct().forEach(System.out::println);


        Stream<String >s1=Stream.of("张三","李四");
        Stream<String >s2=Stream.of("张三2","李四2","王五");
        Stream<String>allSt=Stream.concat(s1,s2);
        allSt.forEach(System.out::println);



    }
}
