package L24_Visitor.classwork.messages;

import L24_Visitor.classwork.messages.abstractions.Element;
import L24_Visitor.classwork.visitors.abstractions.Visitor;

public class LongInformation extends Element {

    public String text;

    public LongInformation(String text) {
        this.text = text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getText() {
        return text;
    }
}
