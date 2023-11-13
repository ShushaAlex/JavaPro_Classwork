package de.telran.module_1.lesson_1;

public class SimpleCatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Korzhik", 7, 4);
        cat1.meow();
        cat1.eat();
        cat1.sleep();

        Cat cat2 = new Cat("Zheka");
        cat2.setAge(8);
        cat2.weight = 8;
        cat2.meow();
    }
}