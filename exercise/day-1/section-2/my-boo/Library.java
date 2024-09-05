import java.util.ArrayList;
import java.util.List;

class Library implements LibraryInterface {
    List<LibraryItem> items;

    Library() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println(item.title + " added.");
    }

    @Override
    public void  removeItem(String itemId) {
        boolean found = false;
        for (LibraryItem item : items) {
            if  (item.itemId.equals(itemId)) {
                items.remove(item);
                System.out.println(item.title + " removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item with id " + itemId + " not found.");
        }
    }

    @Override
    public void listAllItems() {
        for (LibraryItem item : items) {
            item.printDetails();
        }
    }

    @Override
    public void checkOutItem(String itemId) {
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.itemId.equals(itemId)) {
                found = true;
                if (!item.isCheckedOut) {
                    item.checkOut();
                } else {
                    System.out.println(item.title + " is currently checked out.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Item with id " + itemId + " not found.");
        }
    }

    @Override
    public void returnItem(String itemId) {
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.itemId.equals(itemId)) {
                found = true;
                if (item.isCheckedOut) {
                    item.returnItem();
                } else {
                    System.out.println(item.title + " is not checked out.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Item with id " + itemId + " not found.");
        }
    }

    @Override
    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if  (item.title.equals(title)) {
                return item;
            }
        }
        System.out.println("Item not found.");
        return null;
    }
}
