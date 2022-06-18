package L18_Mediator.homework;

import java.util.Objects;

public class Printer {

    private final long id;
    private final String model;
    private volatile int inkCapacity;
    private volatile boolean isBusy = false;


    public Printer(long id, String model, int inkCapacity) {
        this.id = id;
        this.model = model;
        this.inkCapacity = inkCapacity;
    }

    public long getId() {
        return id;
    }

    public int getInkCapacity() {
        return inkCapacity;
    }

    public boolean isBusy() {
        return isBusy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Printer printer = (Printer) o;
        return id == printer.id;
    }

    public synchronized void print(String text) {
        isBusy = true;
        try {
            Thread.sleep(text.length() * 100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(text);
        inkCapacity = text.length() > inkCapacity ? 0 : inkCapacity - text.length();
        isBusy = false;
    }

}
