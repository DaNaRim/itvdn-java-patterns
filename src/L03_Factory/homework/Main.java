package L03_Factory.homework;

import L03_Factory.homework.printers.PrintingType;

public class Main {

    public static void main(String[] args) {
        PrinterFactory printerFactory = new PrinterFactory();

        printerFactory.print(PrintingType.BLACK_AND_WHITE, Format.A3);
        printerFactory.print(PrintingType.COLOR, Format.A4);
        printerFactory.print(PrintingType.PHOTO, Format.A5);
    }
}
