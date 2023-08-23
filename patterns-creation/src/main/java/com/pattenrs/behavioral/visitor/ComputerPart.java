package com.pattenrs.behavioral.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
