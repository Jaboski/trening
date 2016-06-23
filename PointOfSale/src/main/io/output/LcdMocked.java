package main.io.output;

import main.io.output.general.DisplayInterface;

public class LcdMocked implements DisplayInterface {
    @Override
    public void print(String toPrint) {
        System.err.println(toPrint);
    }
}
