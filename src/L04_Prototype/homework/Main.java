package L04_Prototype.homework;

public class Main {

    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("A");
        Room room = new Room("R1", cabinet);
        Office office = new Office("O1", room);

        System.out.println(office);

        Office office2 = office.clone();
        office2.getRoom().getCabinet().setName("A2");

        System.out.println(office);
        System.out.println(office2);

    }
}
