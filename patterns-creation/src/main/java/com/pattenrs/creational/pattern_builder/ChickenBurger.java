package com.pattenrs.creational.pattern_builder;

public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 53.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
