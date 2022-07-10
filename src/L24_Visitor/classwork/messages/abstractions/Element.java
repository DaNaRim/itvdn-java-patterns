package L24_Visitor.classwork.messages.abstractions;

import L24_Visitor.classwork.visitors.abstractions.Visitor;

public abstract class Element {

    public abstract void accept(Visitor visitor);
}
