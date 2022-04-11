package L05_Prototype.homework;

public class Cabinet implements Cloneable {

    private String name;

    public Cabinet(String name) {
        this.name = name;
    }

    @Override
    public Cabinet clone() {
        try {
            return (Cabinet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
