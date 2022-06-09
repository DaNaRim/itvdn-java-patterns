package L15_Command.homework;

public class Main {

    public static void main(String[] args) {
        HistoryContainer history = new HistoryContainer();
        CatFeederController catFeederController = new CatFeederController(history);

        catFeederController.feedCat();
        catFeederController.feedCat();

        System.out.println();
        history.printStack();

    }
}
