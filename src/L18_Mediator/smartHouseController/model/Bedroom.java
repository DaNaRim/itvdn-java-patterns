package L18_Mediator.smartHouseController.model;

public class Bedroom {

    private Status status;

    public Bedroom(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
