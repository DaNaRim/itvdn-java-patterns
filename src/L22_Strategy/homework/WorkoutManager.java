package L22_Strategy.homework;

import L22_Strategy.homework.strategies.*;

import java.util.Locale;
import java.util.Scanner;

public class WorkoutManager {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            WorkoutType preference = WorkoutType.valueOf(scanner.next().toUpperCase(Locale.ROOT));

            WorkoutStrategy workoutStrategy = switch (preference) {
                case FITNESS -> new FitnessStrategy();
                case MASS -> new MassStrategy();
                case RELIEF -> new ReliefStrategy();
                default -> throw new RuntimeException("Invalid preference");
            };
            workoutStrategy.startWorkout();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid preference string");
        }
    }
}
