package Library;

import java.util.ArrayList;

public class LibraryService {

    private ArrayList<Book> books = new ArrayList<>();

    public LibraryService() {
        books.add(new Book(1, "1984"));
        books.add(new Book(2, "Sefiller"));
        books.add(new Book(3, "Suç ve Ceza"));
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public boolean borrowBook(int id) {
        Book book = getBookById(id);

        if (book != null && book.isAvailable()) {
            book.borrow();
            return true;
        }
        return false;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(
                    book.getId() + " - " + book.getTitle() +
                            " | Durum: " + (book.isAvailable() ? "Müsait" : "Ödünçte"));
        }
    }
}
