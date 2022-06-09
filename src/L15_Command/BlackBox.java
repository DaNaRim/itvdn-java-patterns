package L15_Command;

import java.util.ArrayDeque;

public class BlackBox {

    private final ArrayDeque<Command> history = new ArrayDeque<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("History of actions is empty");
            return;
        }
        System.out.println(history.size());
        history.forEach(command -> System.out.println(command.getClass().getSimpleName()));
    }
}
