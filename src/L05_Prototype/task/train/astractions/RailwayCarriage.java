package L05_Prototype.task.train.astractions;

import L05_Prototype.task.exceptions.RailwayCarriageConstructionsException;

import java.util.Arrays;
import java.util.Objects;

public abstract class RailwayCarriage {

    private int lavatoryQuantity;
    private int moduleCapacity;
    private int floorQuantity;
    private CarriageModule[] moduleArray;

    protected RailwayCarriage() {
        this.floorQuantity = 1;
        this.lavatoryQuantity = 2;
        this.moduleCapacity = 9;
        this.moduleArray = new CarriageModule[moduleCapacity];
    }

    protected RailwayCarriage(int floorQuantity) {
        if (floorQuantity == 1) {
            this.floorQuantity = 1;
            this.lavatoryQuantity = 2;
            this.moduleCapacity = 9;
            this.moduleArray = new CarriageModule[moduleCapacity];
        } else if (floorQuantity == 2) {
            this.floorQuantity = 2;
            this.lavatoryQuantity = 4;
            this.moduleCapacity = 16;
            this.moduleArray = new CarriageModule[moduleCapacity];
        } else {
            throw new RailwayCarriageConstructionsException("Wrong quantity of floors");
        }

    }

    protected RailwayCarriage(RailwayCarriage resourceCarriage) {
        if (resourceCarriage != null) {
            this.lavatoryQuantity = resourceCarriage.getLavatoryQuantity();
            this.moduleCapacity = resourceCarriage.getModuleCapacity();
            this.floorQuantity = resourceCarriage.getFloorQuantity();
            this.moduleArray = resourceCarriage.getModuleArray();
        }
    }

    public int getLavatoryQuantity() {
        return lavatoryQuantity;
    }

    public void setLavatoryQuantity(int lavatoryQuantity) {
        this.lavatoryQuantity = lavatoryQuantity;
    }

    public int getModuleCapacity() {
        return moduleCapacity;
    }

    public void setModuleCapacity(int moduleCapacity) {
        this.moduleCapacity = moduleCapacity;
    }

    public int getFloorQuantity() {
        return floorQuantity;
    }

    public void setFloorQuantity(int floorQuantity) {
        this.floorQuantity = floorQuantity;
    }

    public CarriageModule[] getModuleArray() {
        return moduleArray;
    }

    public void setModuleArray(CarriageModule[] moduleArray) {
        this.moduleArray = moduleArray;
    }

    public abstract RailwayCarriage getClone();

    @Override
    public int hashCode() {
        int result = Objects.hash(lavatoryQuantity, moduleCapacity, floorQuantity);
        result = 31 * result + Arrays.hashCode(moduleArray);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RailwayCarriage that = (RailwayCarriage) o;
        return lavatoryQuantity == that.lavatoryQuantity
                && moduleCapacity == that.moduleCapacity
                && floorQuantity == that.floorQuantity
                && Arrays.equals(moduleArray, that.moduleArray);
    }

    @Override
    public String toString() {
        return "RailwayCarriage{" +
                "lavatoryQuantity=" + lavatoryQuantity +
                ", moduleCapacity=" + moduleCapacity +
                ", floorQuantity=" + floorQuantity +
                ", moduleArray=" + Arrays.toString(moduleArray) +
                '}';
    }
}
