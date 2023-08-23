package com.pattenrs.creational.concretas;

import com.pattenrs.creational.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
