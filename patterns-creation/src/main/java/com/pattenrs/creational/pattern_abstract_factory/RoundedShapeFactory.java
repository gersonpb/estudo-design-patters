package com.pattenrs.creational.pattern_abstract_factory;

import com.pattenrs.creational.Shape;
import com.pattenrs.creational.concretas.RoundedRectangle;
import com.pattenrs.creational.concretas.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
