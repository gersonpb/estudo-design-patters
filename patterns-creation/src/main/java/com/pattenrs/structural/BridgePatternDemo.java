package com.pattenrs.structural;

import com.pattenrs.structural.bridge.Circle;
import com.pattenrs.structural.bridge.GreenCircle;
import com.pattenrs.structural.bridge.RedCircle;
import com.pattenrs.structural.bridge.Shape;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
