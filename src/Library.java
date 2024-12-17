import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books ;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){

        books.add(book);
        System.out.println("Susccessfully .");
    }
    public void displayBooks(){
        for (Book book : books){
            System.out.println(book);
        }



    }
}
