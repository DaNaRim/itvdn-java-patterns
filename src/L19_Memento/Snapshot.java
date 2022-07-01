package L19_Memento;

public class Snapshot {

    private final String name;
    private final int armor;
    private final int artilleryShells;
    private final int machineGunAmmo;
    private final Missions mission;

    public Snapshot(String name, int armor, int artilleryShells, int machineGunAmmo, Missions mission) {
        this.name = name;
        this.armor = armor;
        this.artilleryShells = artilleryShells;
        this.machineGunAmmo = machineGunAmmo;
        this.mission = mission;
    }

    public String getName() {
        return name;
    }

    public int getArmor() {
        return armor;
    }

    public int getArtilleryShells() {
        return artilleryShells;
    }

    public int getMachineGunAmmo() {
        return machineGunAmmo;
    }

    public Missions getMission() {
        return mission;
    }
}
