package L18_Mediator.smartHouseController.controllers;

import L18_Mediator.smartHouseController.model.*;
import L18_Mediator.smartHouseController.service.BedroomServiceImpl;
import L18_Mediator.smartHouseController.service.GarageServiceImpl;
import L18_Mediator.smartHouseController.service.KitchenServiceImpl;
import L18_Mediator.smartHouseController.service.TemperatureService;
import L18_Mediator.smartHouseController.service.interfaces.SmartHouseServiceInterface;

public class Mediator {

    private final SmartHouseServiceInterface bedroomService;
    private final SmartHouseServiceInterface garageService;
    private final SmartHouseServiceInterface kitchenService;

    private final TemperatureService temperatureService;

    public Mediator(Bedroom bedroom, Garage garage, Kitchen kitchen) {
        this.bedroomService = new BedroomServiceImpl(bedroom);
        this.garageService = new GarageServiceImpl(garage);
        this.kitchenService = new KitchenServiceImpl(kitchen);
        this.temperatureService = new TemperatureService();
    }

    void manageTemperature(Room room) {
        switch (room) {
            case BEDROOM -> manageTemperature(room, bedroomService);
            case GARAGE -> manageTemperature(room, garageService);
            case KITCHEN -> manageTemperature(room, kitchenService);
            case ALL -> {
                manageTemperature(Room.BEDROOM, bedroomService);
                manageTemperature(Room.GARAGE, garageService);
                manageTemperature(Room.KITCHEN, kitchenService);
            }
            default -> System.out.println("Object not connected");
        }
    }

    void manageTemperature(Room room, SmartHouseServiceInterface service) {
        if (service.checkStatus() == Status.COMFORT) {
            System.out.println(room.name() + " temperature is comfort");
            return;
        }
        if (service.checkStatus() == Status.COLD || service.checkStatus() == Status.WARM) {
            service.heatUp();
            manageTemperature(room, service);
        } else if (service.checkStatus() == Status.HOT || service.checkStatus() == Status.BURN_BABY_BURN) {
            service.coolDown();
            manageTemperature(room, service);
        }
    }

    public void checkOutsideStatus() {
        System.out.println("Temperature outside is " + temperatureService.getOutsideTemperatureStatus().name());
    }

}
