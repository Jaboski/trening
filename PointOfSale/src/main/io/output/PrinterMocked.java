package main.io.output;

import main.io.output.general.DisplayInterface;

public class PrinterMocked implements DisplayInterface {
    @Override
    public void print(String toPrint) {
        System.out.println(toPrint);
    }
}
