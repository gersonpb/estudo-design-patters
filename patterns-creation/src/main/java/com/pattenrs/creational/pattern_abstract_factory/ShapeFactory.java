package com.pattenrs.creational.pattern_abstract_factory;

import com.pattenrs.creational.Shape;
import com.pattenrs.creational.concretas.Rectangle;
import com.pattenrs.creational.concretas.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
