package L03_Factory.homework.printers;

import L03_Factory.homework.Format;

public class ColorPrinter implements Printer {

    @Override
    public void print(Format format) {
        System.out.println("Color printing with format: " + format);
    }
}
