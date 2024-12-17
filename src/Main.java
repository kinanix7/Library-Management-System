import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner =new Scanner(System.in);

        while(true) {
             System.out.println("=========Menu=========\n");
                System.out.println("1. Display Books");
                System.out.println("2. Add Book");
                System.out.println("3. Search Book");
                System.out.println("4. Remove Book");
                System.out.println("5. Edit Book");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
               if (choice==6)
               {
                   break;
               }

                switch (choice){
                    case 1 :library.displayBooks(); break;
                    case 2 :
                        break;
                    case 3 : break;
                    case 4 : break;
                    case 5 : break;
                    default:
                        System.out.println("Invalid choice .");
                        break;
                }



        }

    }

    }
