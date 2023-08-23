package com.pattenrs.creational.pattern_abstract_factory;

import com.pattenrs.creational.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
