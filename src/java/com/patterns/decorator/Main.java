package com.patterns.decorator;

public class Main {

    public static void main(String[] args) {

        Order fourSeasonsPizza = new Pizza("Four Seasons Pizza", 10.0);
        fourSeasonsPizza = new RegularExtra("Pepperoni", 4.0, fourSeasonsPizza);
        fourSeasonsPizza = new DoubleExtra("Mozzarella", 2.0, fourSeasonsPizza);
        fourSeasonsPizza = new NoCostExtra("Chili", fourSeasonsPizza);

        System.out.print(fourSeasonsPizza.getPrice());
        System.out.print(fourSeasonsPizza.getLabel());
    }
}
