package com.itheima.test.Demo07Thread.Demo01Thread;

public class Person {
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public  void show01(){
        for(int  i = 0 ;i <= 20 ; i++) {

            System.out.println(name+i);

            }
        }


}
