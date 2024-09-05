abstract class LibraryItem {
    String title;
    String itemId;
    boolean isCheckedOut;

    LibraryItem(String title,  String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isCheckedOut = false;
    }

    abstract void checkOut();
    abstract void returnItem();
    abstract void printDetails();
}