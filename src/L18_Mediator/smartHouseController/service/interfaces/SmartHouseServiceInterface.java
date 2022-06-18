package L18_Mediator.smartHouseController.service.interfaces;

import L18_Mediator.smartHouseController.model.Status;

public interface SmartHouseServiceInterface {

    Status checkStatus();

    void heatUp();

    void coolDown();
}
