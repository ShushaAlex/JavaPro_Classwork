package de.telran.module_1.summary_1;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setSugar(20);
        fruit.setColor("green");
        fruit.setVitamins(new String[] {"A", "B", "C"});
        fruit.calcCalorie();
        System.out.println(fruit);

        Ananas ananas = new Ananas();
        ananas.setColor("yellow");
        ananas.setCountry("Jamaica");
        System.out.println(ananas);
    }
}
