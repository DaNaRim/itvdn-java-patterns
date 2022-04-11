package L05_Prototype.task.train.modules;

import L05_Prototype.task.train.astractions.CarriageModule;

import java.io.Serializable;

public class LuxSleepingModule extends CarriageModule implements Serializable {

    public LuxSleepingModule() {
        super(2);
    }

    public LuxSleepingModule(CarriageModule resourceModule) {
        super(resourceModule);
    }

    @Override
    public CarriageModule getClone() {
        return new LuxSleepingModule(this);
    }
}
