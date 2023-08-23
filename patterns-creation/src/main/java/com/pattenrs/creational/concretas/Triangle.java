package com.pattenrs.creational.concretas;

import com.pattenrs.creational.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }

}
