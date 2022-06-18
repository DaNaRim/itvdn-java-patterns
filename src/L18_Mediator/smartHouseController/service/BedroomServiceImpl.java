package L18_Mediator.smartHouseController.service;

import L18_Mediator.smartHouseController.model.Bedroom;
import L18_Mediator.smartHouseController.model.Status;
import L18_Mediator.smartHouseController.service.interfaces.SmartHouseServiceInterface;

public class BedroomServiceImpl implements SmartHouseServiceInterface {

    private final Bedroom bedroom;

    public BedroomServiceImpl(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    @Override
    public Status checkStatus() {
        return bedroom.getStatus();
    }

    @Override
    public void heatUp() {
        Status status = bedroom.getStatus();
        bedroom.setStatus(status.next());
        System.out.println("Temperature of bedroom was heated to " + bedroom.getStatus().name() + " status.");
    }

    @Override
    public void coolDown() {
        Status status = bedroom.getStatus();
        bedroom.setStatus(status.previous());
        System.out.println("Temperature of bedroom was cooled to " + bedroom.getStatus().name() + " status.");
    }
}
