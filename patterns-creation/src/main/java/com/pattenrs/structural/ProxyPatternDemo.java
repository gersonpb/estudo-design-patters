package com.pattenrs.structural;

import com.pattenrs.structural.proxy.Image;
import com.pattenrs.structural.proxy.ProxyImage;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
