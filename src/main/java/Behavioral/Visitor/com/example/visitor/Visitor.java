package Behavioral.Visitor.com.example.visitor;

import Behavioral.Visitor.com.example.element.impl.AdultPatient;
import Behavioral.Visitor.com.example.element.impl.ChildPatient;
import Behavioral.Visitor.com.example.element.impl.OldAgePatient;


public interface Visitor {

    void visit(ChildPatient childPatient);

    void visit(AdultPatient adultPatient);

    void visit(OldAgePatient oldAgePatient);

}
