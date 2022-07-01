package L19_Memento;


import java.util.Objects;

public class BattleTank {

    private String name;
    private int armor;
    private int artilleryShells;
    private int machineGunAmmo;
    private Missions mission;

    public BattleTank() {
        this.name = "BattleTank";
        this.armor = 100;
        this.artilleryShells = 50;
        this.machineGunAmmo = 1500;
        this.mission = Missions.TRAINING;
    }

    public BattleTank(String name) {
        this.name = name;
        this.armor = 100;
        this.artilleryShells = 50;
        this.machineGunAmmo = 1500;
        this.mission = Missions.TRAINING;
    }

    public BattleTank(String name, int armor, int artilleryShells, int machineGunAmmo, Missions mission) {
        this.name = name;
        this.armor = armor;
        this.artilleryShells = artilleryShells;
        this.machineGunAmmo = machineGunAmmo;
        this.mission = mission;
    }

    public void attackInfantry() {
        if (this.machineGunAmmo <= 0) {
            System.out.println("No ammo!!!");
            return;
        }
        this.machineGunAmmo -= 25;
        System.out.println("25 bullets were used. 3 infantrymen were killed.");
    }

    public void armoredVehicleAttack() {
        if (this.artilleryShells <= 0) {
            System.out.println("No artillery shells!!");
            return;
        }
        this.artilleryShells -= 1;
        System.out.println("1 artillery shell was used. 1 armored vehicle were destroyed.");
    }

    public void getHit() {
        this.armor -= 10;
        if (this.armor <= 0) {
            System.out.println("You lose!");
        } else {
            System.out.println("Armor: " + this.armor);
        }
    }

    public void finishMission() {
        if (this.mission == Missions.FINAL_BOSS) {
            System.out.println("You win!!!");
        } else {
            this.mission = this.mission.next();
            System.out.println("Congrats! You are at mission: " + this.mission);
        }
    }

    public Snapshot saveGame() {
        return new Snapshot(this.name,
                this.armor,
                this.artilleryShells,
                this.machineGunAmmo,
                this.mission);
    }

    public BattleTank loadGame(Snapshot snapshot) {
        this.name = snapshot.getName();
        this.armor = snapshot.getArmor();
        this.artilleryShells = snapshot.getArtilleryShells();
        this.machineGunAmmo = snapshot.getMachineGunAmmo();
        this.mission = snapshot.getMission();

        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, armor, artilleryShells, machineGunAmmo, mission);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BattleTank that = (BattleTank) o;
        return armor == that.armor
                && artilleryShells == that.artilleryShells
                && machineGunAmmo == that.machineGunAmmo
                && name.equals(that.name)
                && mission == that.mission;
    }

    @Override
    public String toString() {
        return "BattleTank{" +
                "name='" + name + '\'' +
                ", armor=" + armor +
                ", artilleryShells=" + artilleryShells +
                ", machineGunAmmo=" + machineGunAmmo +
                ", mission=" + mission +
                '}';
    }
}
