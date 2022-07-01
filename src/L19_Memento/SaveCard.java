package L19_Memento;

import java.util.ArrayList;
import java.util.List;

public class SaveCard {

    private final List<Snapshot> saves = new ArrayList<>();

    public void addSave(Snapshot snapshot) {
        saves.add(snapshot);
    }

    public Snapshot loadSave(int number) {
        return saves.get(number);
    }

    public boolean isEmpty() {
        return saves.isEmpty();
    }

    public void showSaves() {
        if (this.isEmpty()) {
            System.out.println("No saved game");
            return;
        }
        for (int i = 0; i < saves.size(); i++) {
            System.out.println(i + " " + saves.get(i).getName() + " " + saves.get(i).getMission());
        }
    }
}
