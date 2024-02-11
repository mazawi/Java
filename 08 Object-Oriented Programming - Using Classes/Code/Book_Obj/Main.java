package Book_Obj;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 224);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        book1.displayInfo();
        book2.displayInfo();
    }
}
