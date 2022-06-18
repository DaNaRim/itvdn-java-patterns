package L18_Mediator.homework;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PrintMediator controller = new PrintMediator();

        Printer printer1 = new Printer(1L, "ASD", 100);
        Printer printer2 = new Printer(2L, "ASD", 100);
        Printer printer3 = new Printer(3L, "ASW", 160);

        controller.connectPrinters(printer1, printer2, printer3);

        controller.addDocument(
                "DDDDDDDDDDDDDD",
                "ASDASDASDASDASDSASD",
                "ASD",
                "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF",
                "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF",
                "VVVVVVVVVV",
                "AAAAAAAAAAAAAAA",
                "DDDDDDDDDDD",
                "DDDDDDDDDDDddddd"
        );

        Thread.sleep(2000);

        controller.disconnectPrinters(printer1);
        controller.addDocument(
                "Some very important text",
                "Text, Text, Text, Text, Text, Text, Text, Text, Text, Text, Text"
        );
        controller.connectPrinters(printer1);
    }

}
