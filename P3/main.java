interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printing a document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning a document...");
    }
}

public class Main {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();

        printer.print();
        printer.scan();
    }
}

