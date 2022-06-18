package L18_Mediator.smartHouseController.model;

public enum Status {
    COLD,
    WARM,
    COMFORT,
    HOT,
    BURN_BABY_BURN;

    private static final Status[] values = values();

    public Status next() {
        return values[(this.ordinal() + 1) % values.length];
    }

    public Status previous() {
        return values[(this.ordinal() - 1) % values.length];
    }
}
