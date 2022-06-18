package L18_Mediator.homework;


import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class PrintMediator {

    private final Queue<String> textsToPrint = new LinkedBlockingQueue<>();
    private final Set<Printer> printers = new LinkedHashSet<>();

    private final Set<Printer> printersToAdd = new LinkedHashSet<>();
    private final Set<Printer> printersToRemove = new LinkedHashSet<>();

    private boolean isWorking = false;

    public void addDocument(String... texts) {
        textsToPrint.addAll(Arrays.asList(texts));
        if (!isWorking) init();
    }

    public void connectPrinters(Printer... printers) {
        if (isWorking) {
            printersToAdd.addAll(Arrays.asList(printers));
        } else {
            this.printers.addAll(Arrays.asList(printers));
        }
    }

    public void disconnectPrinters(Printer... printers) {
        if (isWorking) {
            printersToRemove.addAll(Arrays.asList(printers));
        } else {
            Arrays.asList(printers).forEach(this.printers::remove);
        }
    }

    @SuppressWarnings("BusyWait")
    private void init() {
        isWorking = true;
        if (printers.isEmpty()) {
            throw new RuntimeException("No printers connected");
        }
        new Thread(() -> {
            while (!textsToPrint.isEmpty()) {
                long emptyPrinters = printers.stream().filter(printer -> printer.getInkCapacity() == 0).count();

                if (emptyPrinters == printers.size()) {
                    System.err.println("The ink ran out in all printers");
                    break;
                }

                Iterator<Printer> printerIterator = printers.iterator();
                Iterator<String> textIterator = textsToPrint.iterator();

                while (printerIterator.hasNext()) {
                    Printer printer = printerIterator.next();

                    if (!textIterator.hasNext()) break;

                    if (printer.getInkCapacity() == 0) {
                        System.err.println("The ink ran out in printer: " + printer.getId());
                        continue;
                    }
                    if (!printer.isBusy()) {
                        String text = textIterator.next();
                        new Thread(() -> printer.print(text)).start();
                        textIterator.remove();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        printers.addAll(printersToAdd);
        printersToAdd.clear();
        printers.removeAll(printersToRemove);
        printersToRemove.clear();
        isWorking = false;
    }

}
