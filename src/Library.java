import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<Book> stock = new ArrayList<>();
            for (Book book : books) {
                if ((title != null && title.equals(book.getTitle()))||
                (isbn != null && isbn.equals(book.getIsbn()))||
                (author != null && author.equals(book.getAuthor()))) {

                    stock.add(book);
                    System.out.println(stock);
                }

            }
            if (stock.isEmpty()) {
                System.out.println("No books found.");
            }
            return stock.get(0);
        }


    public void removeBook(String isbn) {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        }
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book removed successfully.");


    }

    public void updateBook(String isbn, int choiceupdate) {
        Scanner scanner = new Scanner(System.in);
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {

                switch (choiceupdate) {
                    case 1:
                        System.out.print("Enter new title: ");
                        book.setTitle(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter new author: ");
                        book.setAuthor(scanner.nextLine());
                        break;
                    case 3:
                        System.out.print("Is the book available? (true/false): ");
                        book.setAvailable(scanner.nextBoolean());
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
