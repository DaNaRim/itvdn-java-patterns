package L18_Mediator.smartHouseController.service;

import L18_Mediator.smartHouseController.model.Kitchen;
import L18_Mediator.smartHouseController.model.Status;
import L18_Mediator.smartHouseController.service.interfaces.SmartHouseServiceInterface;

public class KitchenServiceImpl implements SmartHouseServiceInterface {

    private final Kitchen kitchen;

    public KitchenServiceImpl(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public Status checkStatus() {
        return kitchen.getStatus();
    }

    @Override
    public void heatUp() {
        Status status = kitchen.getStatus();
        kitchen.setStatus(status.next());
        System.out.println("Temperature of kitchen was heated to " + kitchen.getStatus().name() + " status.");
    }

    @Override
    public void coolDown() {
        Status status = kitchen.getStatus();
        kitchen.setStatus(status.previous());
        System.out.println("Temperature of kitchen was cooled to " + kitchen.getStatus().name() + " status.");
    }
}
