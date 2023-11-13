package de.telran.module_1.lesson_1;

public class Cat {
    public String name;
    int weight;
    protected int age;
    private boolean sterilized;

    public boolean isSterilized() {
        if (age > 2) {
            return true;
        }
        return false;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("age is not correct");
        }
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
// default constructor
    public Cat() {
    }
// constructor with one param
    public Cat(String name) {
        this.name = name;
    }

    void meow() {
        System.out.println(name + " says Meow Meow Meow Meow" + " weight: " + weight + " age: " + age);
    }

    void sleep() {
        System.out.println(name + " sleeps Zzzzz Zzzzz Zzzzz" + " weight: " + weight + " age: " + age);
    }

    void eat() {
        System.out.println(name + " eats omnom omnom omnom" + " weight: " + weight + " age: " + age);
    }
 }
