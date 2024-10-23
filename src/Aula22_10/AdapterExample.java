package Aula22_10;

interface OldPrinter {
    void printOld(String text);
}


class OldPrinterImpl implements OldPrinter {
    @Override
    public void printOld(String text) {
        System.out.println("Imprimindo da forma antiga: " + text);
    }
}


interface NewPrinter {
    void print(String text);
}


class PrinterAdapter implements NewPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String text) {
        oldPrinter.printOld(text);
    }
}


public class AdapterExample {
    public static void main(String[] args) {
        
        OldPrinter oldPrinter = new OldPrinterImpl();
        
        
        NewPrinter printer = new PrinterAdapter(oldPrinter);

        
        printer.print("Testando o adaptador.");
    }
}
