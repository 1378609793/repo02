package com.itheima.test.Demo07Thread.Demo07Lambda.Demo02LambdaTest;

public class Person {
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

    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int  age;

}
