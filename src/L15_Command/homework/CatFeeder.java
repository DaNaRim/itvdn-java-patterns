package L15_Command.homework;

import java.util.concurrent.TimeUnit;

public class CatFeeder {

    private static final int MEAL_SPACING_IN_HOURS = 4;
    private static final int DEFAULT_FEED_PORTION = 100;

    private int amountOfFoodInFeeder = 8000;
    private int amountOfFoodInBowl = 0;
    private long lastFeedTime = 0L;

    public boolean feedCat() {
        double timeAfterLastFeed = (double)
                TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() + 100_000 - lastFeedTime) / 60;

        int portion = DEFAULT_FEED_PORTION - amountOfFoodInBowl;

        if (timeAfterLastFeed < MEAL_SPACING_IN_HOURS) {
            double timeToWait = MEAL_SPACING_IN_HOURS - timeAfterLastFeed;

            long hours = (long) Math.floor(timeToWait);
            long minutes = (long) Math.floor(timeToWait % 1 * 60);
            System.out.printf("It`s not time to eat. Please wait %d hours and %d minutes%n", hours, minutes);
            return false;
        }
        if (amountOfFoodInFeeder < portion) {
            System.out.println("There is not enough food in feeder");
            return false;
        }

        amountOfFoodInFeeder -= portion;
        amountOfFoodInBowl += portion;
        lastFeedTime = System.currentTimeMillis();

        System.out.println("Cat is happy now =) Current amount of food in feeder is " + amountOfFoodInFeeder);
        return true;
    }

    public int getAmountOfFoodInFeeder() {
        return amountOfFoodInFeeder;
    }

    public int getAmountOfFoodInBowl() {
        return amountOfFoodInBowl;
    }

    public long getLastFeedTime() {
        return lastFeedTime;
    }
}
