class Book extends LibraryItem {
    String author;
    int pages;

    Book(String title,  String itemId, String author, int pages) {
        super(title, itemId);
        this.author = author;
        this.pages = pages;
    }

    @Override
    void checkOut() {
        if (isCheckedOut) {
            System.out.println("The book titled " + title + " is currently checked out.");
        } else {
            isCheckedOut = true;
            System.out.println("The book titled " + title + " checked out.");
        }
    }

    @Override
    void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("The book titled " + title + " returned.");
        } else {
            System.out.println("The book titled " + title + " is not checked out.");
        }
    }

    @Override
    void printDetails() {
        System.out.println("Item Id: " + itemId + ", Book Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Checked Out: " + isCheckedOut);
    }
}