package Book_Obj;

class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + ", Pages: " + pages);
    }
}

