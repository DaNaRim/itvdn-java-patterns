package L15_Command.homework;

import java.util.concurrent.TimeUnit;

public class CatFeeder {

    private static final long mealSpacingInHours = 4;
    private static final int defaultFeedPortion = 100;

    private int amountOfFoodInTheFeeder = 8000;
    private int amountOfFoodInTheBowl = 0;
    private long lastFeedTime = 0L;

    public boolean feedCat() {
        double timeAfterLastFeed =
                (double) TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - lastFeedTime) / 60;

        int portion = defaultFeedPortion - amountOfFoodInTheBowl;

        if (timeAfterLastFeed < mealSpacingInHours) {
            long hours = Math.round(mealSpacingInHours - Math.ceil(timeAfterLastFeed));
            long minutes = (long) ((timeAfterLastFeed - (int) timeAfterLastFeed) * 60);
            if (minutes != 0) minutes = 60 - minutes;
            System.out.printf("It`s not time to eat. Please wait %d hours and %d minutes%n", hours, minutes);
            return false;
        }
        if (amountOfFoodInTheFeeder < portion) {
            System.out.println("There is not enough food in feeder");
            return false;
        }

        amountOfFoodInTheFeeder -= portion;
        amountOfFoodInTheBowl += portion;
        lastFeedTime = System.currentTimeMillis();

        System.out.println("Cat is happy now =) Current amount of food in feeder is " + amountOfFoodInTheFeeder);
        return true;
    }

    public int getAmountOfFoodInTheFeeder() {
        return amountOfFoodInTheFeeder;
    }

    public int getAmountOfFoodInTheBowl() {
        return amountOfFoodInTheBowl;
    }

    public long getLastFeedTime() {
        return lastFeedTime;
    }
}
