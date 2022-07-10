package L24_Visitor.classwork.messages;

import L24_Visitor.classwork.messages.abstractions.Element;
import L24_Visitor.classwork.visitors.abstractions.Visitor;

public class ShortInformation extends Element {

    private String text;

    public ShortInformation(String text) {
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
