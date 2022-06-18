package L18_Mediator.smartHouseController.model;

public class Garage {

    private Status status;

    public Garage(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
