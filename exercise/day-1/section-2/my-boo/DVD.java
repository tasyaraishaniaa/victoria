class DVD extends LibraryItem {
    String director;
    int duration;

    DVD(String title, String itemId, String director, int duration) {
        super(title, itemId);
        this.director = director;
        this.duration = duration;
    }

    @Override
    void checkOut() {
        if (isCheckedOut) {
            System.out.println("The DVD titled " + title + " is currently checked out.");
        } else {
            isCheckedOut = true;
            System.out.println("The DVD titled " + title + " checked out.");
        }
    }

    @Override
    void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("The DVD titled " + title + " returned.");
        } else {
            System.out.println("The DVD titled " + title + " is not checked out.");
        }
    }

    @Override
    void printDetails() {
        System.out.println("Item Id: " + itemId + ", DVD Title: " + title + ", Director: " + director + ", Duration: " + duration + ", Checked Out: " + isCheckedOut);
    }
}