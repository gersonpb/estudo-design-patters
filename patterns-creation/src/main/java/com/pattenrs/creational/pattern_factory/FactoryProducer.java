package com.pattenrs.creational.pattern_factory;

import com.pattenrs.creational.pattern_abstract_factory.AbstractFactory;
import com.pattenrs.creational.pattern_abstract_factory.RoundedShapeFactory;
import com.pattenrs.creational.pattern_abstract_factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
