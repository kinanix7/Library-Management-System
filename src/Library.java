import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }




    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        }
        for (Book book : books) {
            System.out.println(book);
        }
        }
        public Book searchBook(String title, String author, String isbn) {
            for (Book book : books) {
                if ((title != null && title.equals(book.getTitle()))||
                (isbn != null && isbn.equals(book.getIsbn()))||
                (author != null && author.equals(book.getAuthor()))) {
                    return book;
                }

            }
            return null;
        }


    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book removed successfully.");


    }
}
