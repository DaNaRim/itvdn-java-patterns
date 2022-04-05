package L03_Factory.homework.printers;

import L03_Factory.homework.Format;

public class PhotoPrinter implements Printer {

    @Override
    public void print(Format format) {
        System.out.println("Photo printing with format: " + format);
    }
}
