package Behavioral.Visitor.com.example.visitor.impl;

import Behavioral.Visitor.com.example.element.impl.AdultPatient;
import Behavioral.Visitor.com.example.element.impl.ChildPatient;
import Behavioral.Visitor.com.example.element.impl.OldAgePatient;
import Behavioral.Visitor.com.example.visitor.Visitor;


public class Discount implements Visitor {

    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("#ChildPatient:: 20% Discount on Billing.");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("#AdultPatient:: 10% Discount on Billing.");
    }

    @Override
    public void visit(OldAgePatient oldAgePatient) {
        System.out.println("#OldAgePatient:: 30% Discount on Billing.");
    }

}
