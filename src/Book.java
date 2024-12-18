public class Book {
     String title;
     String author;
     String isbn;
     boolean isAvailable;

    public Book(String title , String author , String isbn , boolean isAvailable){
         this.title = title;
         this.author = author ;
         this.isbn = isbn ;
         this.isAvailable = isAvailable;

     }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override

    public String toString() {


        return "------------------------ \n" +
                "\nTitle : " + title +
                "\nAuthor : " + author +
                "\nIsbn : " + isbn +
                "\nIsAvailable :" + isAvailable +
                "\n";
    }
}
