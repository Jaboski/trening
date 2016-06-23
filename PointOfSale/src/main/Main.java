package main;

import main.database.ItemDatabaseMocked;
import main.database.entities.Item;
import main.database.general.CrudRepositoryInterface;
import main.io.input.BarcodeReaderMocked;
import main.io.input.general.ReaderInterface;
import main.io.output.LcdMocked;
import main.io.output.PrinterMocked;
import main.io.output.general.DisplayInterface;

public class Main {
    public static void main(String[] args) {
        CrudRepositoryInterface<Item, String> database = new ItemDatabaseMocked(10);
        ReaderInterface reader = new BarcodeReaderMocked((ItemDatabaseMocked)database);
        DisplayInterface printer = new PrinterMocked();
        DisplayInterface lcd = new LcdMocked();

        StringBuilder recipe = new StringBuilder("Paragon:\n");
        String barcode;
        long sum = 0;

        do {
            barcode = reader.read();

            if (barcode.equals("")) {
                lcd.print("Invalid bar-code");
            }
            else if (database.contains(barcode)) {
                Item item = database.get(barcode);
                String name = item.getName();
                long price = item.getPrice();
                sum += price;
                String priceAsString = formatPennies(price);
                lcd.print(name + " - " + priceAsString);
                recipe.append(" - " + name + " - " + priceAsString + '\n');
            }
            else {
                lcd.print("Product not found");
            }
        } while(!barcode.equals("exit"));

        recipe.append("Sum: " + formatPennies(sum));

        printer.print(recipe.toString());
    }

    private static String formatPennies(long value) {
        return value / 100 + "," + value % 100 + " zł";
    }
}
