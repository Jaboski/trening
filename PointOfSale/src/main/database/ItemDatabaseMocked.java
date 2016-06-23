package main.database;

import main.database.entities.Item;
import main.database.general.CrudRepositoryInterface;

import java.util.*;

public class ItemDatabaseMocked implements CrudRepositoryInterface<Item, String> {
    private Map<String, Item> items = new HashMap<>();

    public ItemDatabaseMocked(int mockedItemsAmount) {
        for (int i = 0; i < mockedItemsAmount; i++) {
            add(getMockedItem());
        }
    }

    private Item getMockedItem() {
        Item item = new Item();
        item.setBarcode(getMockedBarcode());
        item.setName(getMockedName());
        item.setPrice(getMockedPrice());
        System.out.println("[DEBUG] Created item " + item.getBarcode() + " (" + item.getName() + "), value = " + item.getPrice());
        return item;
    }

    private String getMockedBarcode() {
        return String.valueOf(new Random().nextInt(99999));
    }

    private String getMockedName() {
        return UUID.randomUUID().toString().substring(0, 6);
    }

    private long getMockedPrice() {
        return new Random().nextInt(999);
    }


    @Override
    public void add(Item item) {
        items.put(item.getBarcode(), item);
    }

    @Override
    public void update(Item item) {
        add(item);
    }

    @Override
    public Item get(String barcode) {
        return items.get(barcode);
    }

    @Override
    public void remove(String barcode) {
        items.remove(barcode);
    }

    @Override
    public boolean contains(String barcode) {
        return items.containsKey(barcode);
    }

    public List<String> getValidBarcodes() {
        return new ArrayList<>(items.keySet());
    }
}
