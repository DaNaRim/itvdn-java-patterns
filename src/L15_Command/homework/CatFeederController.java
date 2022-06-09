package L15_Command.homework;

public class CatFeederController {

    private static final FeedCatCommand feedCatCommand = new FeedCatCommand();
    private final HistoryContainer history;

    public CatFeederController(HistoryContainer history) {
        this.history = history;
    }

    public void feedCat() {
        if (feedCatCommand.execute()) history.push(feedCatCommand);
    }

}
