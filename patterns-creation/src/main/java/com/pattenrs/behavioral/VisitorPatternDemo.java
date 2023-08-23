package com.pattenrs.behavioral;

import com.pattenrs.behavioral.visitor.Computer;
import com.pattenrs.behavioral.visitor.ComputerPart;
import com.pattenrs.behavioral.visitor.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
