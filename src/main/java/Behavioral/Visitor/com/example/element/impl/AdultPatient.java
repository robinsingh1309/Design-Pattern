package Behavioral.Visitor.com.example.element.impl;

import Behavioral.Visitor.com.example.element.Patient;
import Behavioral.Visitor.com.example.visitor.Visitor;


public class AdultPatient implements Patient {

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }

}
