public class Main {
    public static void main(String[] args) {
        LibraryInterface library = new Library();

        Book book1 = new Book("Buku 01", "B001", "Tasya", 11);
        Book book2 = new Book("Buku 02", "B002", "Raishania", 2000);
        library.addItem(book1);
        library.addItem(book2);

        DVD dvd1 = new DVD("DVD 01", "D001", "Amarin", 12);
        DVD dvd2 = new DVD("DVD 02", "D002", "Gata", 2024);
        library.addItem(dvd1);
        library.addItem(dvd2);

        library.removeItem("D002");

        library.listAllItems();

        library.checkOutItem("B001");

        library.listAllItems();

        library.returnItem("B001");

        library.listAllItems();

        System.out.println("Search By Title: Buku 01");

        LibraryItem searchedItem = library.searchByTitle("Buku 01");
        if (searchedItem != null) {
            searchedItem.printDetails();
        } else {
            System.out.println("Item not found.");
        }
    }
}
