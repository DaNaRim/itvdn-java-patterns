package L04_Prototype.homework;

public class Room implements Cloneable {

    private String name;
    private Cabinet cabinet;

    public Room(String name, Cabinet cabinet) {
        this.name = name;
        this.cabinet = cabinet;
    }

    @Override
    public Room clone() {
        try {
            Room clone = (Room) super.clone();
            clone.cabinet = this.cabinet.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", cabinet=" + cabinet +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public void setCabinet(Cabinet cabinet) {
        this.cabinet = cabinet;
    }
}
