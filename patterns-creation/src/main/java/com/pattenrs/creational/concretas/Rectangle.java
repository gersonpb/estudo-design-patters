package com.pattenrs.creational.concretas;

import com.pattenrs.creational.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
