package com.pattenrs.creational.pattern_factory;

import com.pattenrs.creational.Shape;
import com.pattenrs.creational.concretas.Circle;
import com.pattenrs.creational.concretas.Rectangle;
import com.pattenrs.creational.concretas.Square;
import com.pattenrs.creational.concretas.Triangle;

public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }

        return null;
    }
}
