package L04_Prototype.task.train.modules;

import L04_Prototype.task.train.astractions.CarriageModule;

public class SleepingModule extends CarriageModule {

    public SleepingModule() {
        super(4);
    }

    public SleepingModule(CarriageModule resourceModule) {
        super(resourceModule);
    }

    @Override
    public CarriageModule getClone() {
        return new SleepingModule(this);
    }
}
