package L15_Command.homework;

public class FeedCatCommand implements Command {

    private static final CatFeeder feeder = new CatFeeder();

    private int amountOfFoodInTheFeeder;
    private int amountOfFoodInTheBowl;
    private long lastFeedTime;

    public boolean execute() {
        amountOfFoodInTheBowl = feeder.getAmountOfFoodInTheBowl();
        amountOfFoodInTheFeeder = feeder.getAmountOfFoodInTheFeeder();
        lastFeedTime = feeder.getLastFeedTime();
        return feeder.feedCat();
    }

    @Override
    public String toString() {
        return "FeedCatCommand{" +
                "amountOfFoodInTheFeeder=" + amountOfFoodInTheFeeder +
                ", amountOfFoodInTheBowl=" + amountOfFoodInTheBowl +
                ", lastFeedTime=" + lastFeedTime +
                '}';
    }
}
