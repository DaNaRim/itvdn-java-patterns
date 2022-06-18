package L18_Mediator.smartHouseController.service;

import L18_Mediator.smartHouseController.model.Garage;
import L18_Mediator.smartHouseController.model.Status;
import L18_Mediator.smartHouseController.service.interfaces.SmartHouseServiceInterface;

public class GarageServiceImpl implements SmartHouseServiceInterface {

    private final Garage garage;

    public GarageServiceImpl(Garage garage) {
        this.garage = garage;
    }

    @Override
    public Status checkStatus() {
        return garage.getStatus();
    }

    @Override
    public void heatUp() {
        Status status = garage.getStatus();
        garage.setStatus(status.next());
        System.out.println("Temperature of garage was heated to " + garage.getStatus().name() + " status.");
    }

    @Override
    public void coolDown() {
        Status status = garage.getStatus();
        garage.setStatus(status.previous());
        System.out.println("Temperature of garage was cooled to " + garage.getStatus().name() + " status.");
    }
}
