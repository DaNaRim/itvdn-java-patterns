package L04_Prototype.task.train.modules;

import L04_Prototype.task.train.astractions.CarriageModule;

public class SittingModule extends CarriageModule {

    public SittingModule() {
        super(6);
    }

    public SittingModule(CarriageModule resourceModule) {
        super(resourceModule);
    }

    @Override
    public CarriageModule getClone() {
        return new SittingModule(this);
    }
}
