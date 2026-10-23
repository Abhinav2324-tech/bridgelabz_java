package com.bridgelabz.java_designpatterns;
interface Printer {
    void print();
}

// Existing incompatible class
class OldPrinter {
    public void oldPrint() {
        System.out.println("Printing using old printer");
    }
}

// Adapter
class PrinterAdapter implements Printer {

    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    public void print() {
        oldPrinter.oldPrint();
    }
}

public class Adapter
{
    public static void main(String[] args) {

        OldPrinter oldPrinter = new OldPrinter();

        Printer printer = new PrinterAdapter(oldPrinter);

        printer.print();
    }
}
