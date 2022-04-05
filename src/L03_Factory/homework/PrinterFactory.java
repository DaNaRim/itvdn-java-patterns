package L03_Factory.homework;

import L03_Factory.homework.printers.BlackAndWhitePrinter;
import L03_Factory.homework.printers.ColorPrinter;
import L03_Factory.homework.printers.PhotoPrinter;
import L03_Factory.homework.printers.PrintingType;

public class PrinterFactory {

    public final void print(PrintingType printingType, Format format) {
        switch (printingType) {
            case BLACK_AND_WHITE -> new BlackAndWhitePrinter().print(format);
            case COLOR -> new ColorPrinter().print(format);
            case PHOTO -> new PhotoPrinter().print(format);
            default -> throw new RuntimeException("Unknown printing type");
        }
    }
}
