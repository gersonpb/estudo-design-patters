package com.pattenrs.creational.pattern_builder;

public class VegBurger extends Burger{
    @Override
    public float price() {
        return 57.25f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
