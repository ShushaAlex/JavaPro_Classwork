package de.telran.module_1.summary_1.child;

import de.telran.module_1.summary_1.Fruit;

import java.util.Arrays;

public class Ananas extends Fruit {
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Ananas {" +
                "country = '" + country + '\'' +
                ", color = '" + super.getColor() + '\'' +
                ", sugar = " + super.getSugar() +
                ", vitamins = " + Arrays.toString(super.getVitamins()) +
                " }";
    }
}
