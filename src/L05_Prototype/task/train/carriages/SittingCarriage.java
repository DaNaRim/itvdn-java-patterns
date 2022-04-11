package L05_Prototype.task.train.carriages;

import L05_Prototype.task.train.astractions.CarriageModule;
import L05_Prototype.task.train.astractions.RailwayCarriage;
import L05_Prototype.task.train.modules.SittingModule;

public class SittingCarriage extends RailwayCarriage {

    public SittingCarriage() {
        super();
        this.setModules();
    }

    public SittingCarriage(int floorQuantity) {
        super(floorQuantity);
        this.setModules();
    }

    public SittingCarriage(RailwayCarriage targetCarriage) {
        super(targetCarriage);
        this.setModules();
    }

    private void setModules() {
        CarriageModule module = new SittingModule();
        for(int i = 0; i < this.getModuleCapacity(); i++) {
            this.getModuleArray()[i] = module.getClone();
        }
    }

    @Override
    public RailwayCarriage getClone() {
        return new SittingCarriage(this);
    }
}
