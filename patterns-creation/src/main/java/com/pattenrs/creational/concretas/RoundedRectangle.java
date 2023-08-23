package com.pattenrs.creational.concretas;

import com.pattenrs.creational.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
