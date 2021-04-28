package com.wordpress.boxofcubes.junitspringbootunittesting.models;

public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean nameContainsLetter(char c){
        if(name.indexOf(c) != -1){
            return true;
        }else{
            return false;
        }
    }

    public int ageInXYears(int x){
        return age + x;
    }



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
}
