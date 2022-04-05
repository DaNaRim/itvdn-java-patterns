package L03_Factory.homework.printers;

import L03_Factory.homework.Format;

public class BlackAndWhitePrinter implements Printer {

    @Override
    public void print(Format format) {
        System.out.println("Black and white printing with format: " + format);
    }
}
