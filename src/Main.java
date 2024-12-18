import java.util.Scanner;

public class Main {
    static Library library = new Library();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=========Menu=========\n");
            System.out.println("1. Display Books");
            System.out.println("2. Add Book");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Edit Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 6) {
                break;
            }

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book isbn: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter book availability (true/false): ");
        boolean isAvailable = scanner.nextBoolean();

        scanner.nextLine();

        Book book = new Book(title, author, isbn, isAvailable);
        library.addBook(book);

    }
    static  void editBook() {
        System.out.println();
    }
}
