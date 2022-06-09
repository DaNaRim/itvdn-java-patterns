package L15_Command.homework;

import java.util.ArrayDeque;

public class HistoryContainer {

    private final ArrayDeque<Command> history = new ArrayDeque<>();

    public void push(Command command) {
        history.push(command);
    }

    public void printStack() {
        if (history.isEmpty()) {
            System.out.println("History of actions is empty");
            return;
        }
        System.out.println(history.size());
        history.forEach(command -> System.out.println(command.toString()));
    }

}
