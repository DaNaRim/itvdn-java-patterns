package L24_Visitor.classwork.visitors.abstractions;

import L24_Visitor.classwork.messages.LongInformation;
import L24_Visitor.classwork.messages.ShortInformation;

public interface Visitor {

    void visit(LongInformation e);

    void visit(ShortInformation e);
}
