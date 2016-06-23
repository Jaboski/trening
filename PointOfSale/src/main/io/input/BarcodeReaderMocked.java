package main.io.input;

import main.database.ItemDatabaseMocked;
import main.io.input.general.ReaderInterface;

import java.util.List;
import java.util.Random;

public class BarcodeReaderMocked implements ReaderInterface {
    private List<String> validBarcodes;
    private Random generator = new Random();

    public BarcodeReaderMocked(ItemDatabaseMocked itemDatabaseMocked) {
        validBarcodes = itemDatabaseMocked.getValidBarcodes();
    }

    @Override
    public String read() {
        int rand = generator.nextInt(100);

        if (rand < 45) {
            return validBarcodes.get(generator.nextInt(validBarcodes.size()));
        } else if (rand < 90) {
            return "InvalidBarcode" + generator.nextInt(999);
        } else {
            return "exit";
        }
    }
}
