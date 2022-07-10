package L24_Visitor.classwork.visitors;

import L24_Visitor.classwork.messages.LongInformation;
import L24_Visitor.classwork.messages.ShortInformation;
import L24_Visitor.classwork.visitors.abstractions.Visitor;

public class Ticker implements Visitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(LongInformation longMessage) {
        sb.append("/");
        String reducesString = longMessage.getText();
        if (reducesString.length() > 20) {
            sb.append(longMessage.getText(), 0, 20);
        } else {
            sb.append(longMessage.getText());
        }
        sb.append("/ ");
    }

    @Override
    public void visit(ShortInformation normalMessage) {
        sb.append("/");
        sb.append(normalMessage.getText());
        sb.append("/ ");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
