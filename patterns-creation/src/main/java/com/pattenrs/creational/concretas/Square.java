package com.pattenrs.creational.concretas;

import com.pattenrs.creational.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
