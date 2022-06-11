package L15_Command.homework;

public class FeedCatCommand implements Command {

    private static final CatFeeder feeder = new CatFeeder();

    private int amountOfFoodInFeeder;
    private int amountOfFoodInBowl;
    private long lastFeedTime;

    public boolean execute() {
        amountOfFoodInBowl = feeder.getAmountOfFoodInBowl();
        amountOfFoodInFeeder = feeder.getAmountOfFoodInFeeder();
        lastFeedTime = feeder.getLastFeedTime();
        return feeder.feedCat();
    }

    @Override
    public String toString() {
        return "FeedCatCommand{" +
                "amountOfFoodInFeeder=" + amountOfFoodInFeeder +
                ", amountOfFoodInBowl=" + amountOfFoodInBowl +
                ", lastFeedTime=" + lastFeedTime +
                '}';
    }
}
