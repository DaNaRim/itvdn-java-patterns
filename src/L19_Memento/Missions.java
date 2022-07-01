package L19_Memento;

public enum Missions {
    TRAINING,
    FIRST_MISSION,
    SECOND_MISSION,
    THIRD_MISSION,
    FINAL_BOSS;
    private static final Missions[] values = values();

    public Missions next() {
        return values[(this.ordinal() + 1) % values.length];
    }
}
