package L04_Prototype.homework;

public class Office implements Cloneable {

    private String name;
    private Room room;

    public Office(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    @Override
    public Office clone() {
        try {
            Office clone = (Office) super.clone();
            clone.room = this.room.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Office{" +
                "name='" + name + '\'' +
                ", room=" + room +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
