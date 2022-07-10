package L24_Visitor.homework.entities;

import L24_Visitor.homework.visitors.Visitor;

public interface Visitable {

    String accept(Visitor visitor);
}
