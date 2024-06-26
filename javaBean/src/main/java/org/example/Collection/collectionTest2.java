package org.example.Collection;

import org.example.entity.User;

import java.util.ArrayList;
import java.util.Collection;

public class collectionTest2 {
    public static void main(String[] args) {
        Collection<User>users=new ArrayList<>();
        users.add(new User("user","123456","123","1",18));
        users.add(new User("user1","1234567","123","1",19));
        users.add(new User("user2","12345678","123","1",20));
        users.add(new User("user3","123456789","123","1",21));
        System.out.println(users);
        for (User user : users) {
            System.out.println("name:"+user.getUsername());
            System.out.println("password:"+user.getPassword());
            System.out.println("email:"+user.getEmail());
            System.out.println("gender:"+user.getGender());
            System.out.println("age:"+user.getAge());
            System.out.println("-----------");
        }

    }
}
