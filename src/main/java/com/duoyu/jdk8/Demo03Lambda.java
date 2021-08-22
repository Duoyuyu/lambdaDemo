package com.duoyu.jdk8;

import com.duoyu.jdk8.domain.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description
 * @Author wangduoyu
 * @Date 2021/8/20
 */
public class Demo03Lambda {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("小A", 10));
        list.add(new User("小B", 30));
        list.add(new User("小C", 8));
        list.add(new User("小D", 12));
        list.add(new User("小E", 26));

        // 标准写法
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        // lambda标准写法
        Collections.sort(list, (User o1,User o2) -> {
            return o1.getAge() - o2.getAge();
        });

        list.forEach((User user) -> {
            System.out.println(user);
        });

        // lambda省略写法
        list.forEach(user -> System.out.println(user));

        Collections.sort(list, (o1,o2) -> o2.getAge() - o1.getAge());

    }
}
