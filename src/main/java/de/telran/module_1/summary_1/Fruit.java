package de.telran.module_1.summary_1;

import java.util.Arrays;

public class Fruit {
    private String color;
    private int sugar;
    private String[] vitamins;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

    protected String getColor() {
        return color;
    }

    protected int getSugar() {
        return sugar;
    }

    public String[] getVitamins() {
        return vitamins;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color = '" + color + '\'' +
                ", sugar = " + sugar +
                ", vitamins = " + Arrays.toString(vitamins) +
                '}';
    }

    protected void calcCalorie() {
        System.out.println(sugar * 100);
    }
}
