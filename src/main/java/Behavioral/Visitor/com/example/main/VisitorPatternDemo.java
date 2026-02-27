package Behavioral.Visitor.com.example.main;

import Behavioral.Visitor.com.example.element.impl.AdultPatient;
import Behavioral.Visitor.com.example.element.impl.ChildPatient;
import Behavioral.Visitor.com.example.element.impl.OldAgePatient;
import Behavioral.Visitor.com.example.visitor.Visitor;
import Behavioral.Visitor.com.example.visitor.impl.Billing;
import Behavioral.Visitor.com.example.visitor.impl.Discount;


public class VisitorPatternDemo {

    public static void main(String[] args) {

        ChildPatient childPatient = new ChildPatient();
        AdultPatient adultPatient = new AdultPatient();
        OldAgePatient oldAgePatient = new OldAgePatient();

        /** Billing processed */
        Visitor billingOperation = new Billing();

        childPatient.visit(billingOperation);
        adultPatient.visit(billingOperation);
        oldAgePatient.visit(billingOperation);

        /** Discount that will be processed */
        Visitor discountOperation = new Discount();

        childPatient.visit(discountOperation);
        adultPatient.visit(discountOperation);
        oldAgePatient.visit(discountOperation);
    }

}
