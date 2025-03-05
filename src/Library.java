
import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    ArrayList<Book> books=new ArrayList<Book>();

    Book book;
    public void AddBook(String id, String title, String author, int year) {
       book=new Book(id,title,author,year);
        books.add(book);


    }
    public void getBooks() {
        int count=0;
        for(Book b:books){
            count++;
            System.out.print(count+"-");
            System.out.println("Book ID :"+b.getId()+" "+"book name :"+b.getTitle()+" "+"Author of the book :"+b.getAuthor()+" "+"Publication year :"+b.getYear());

        }
        count=0;
    }

    public void getBooksByTitle(String title) {
        int foundBook = 0;
        if (books.isEmpty()) {
            System.out.println("No book found in the library.");
        } else {

        for (Book b : books) {

            if (b.getTitle().equals(title)) {
                System.out.println("Book ID :" + b.getId() + " " + "book name :" + b.getTitle() + " " + "Author of the book :" + b.getAuthor() + " " + "Publication year :" + b.getYear());
                foundBook = 1;
            }

        }
        if (foundBook == 0) {
            System.out.println("No book found in the library.");
        }
        foundBook = 0;
    }
    }

    public void deleteBooksById(String id) {
        if (books.isEmpty()) {
            System.out.println("No book found in the library.");
            return;
        } else {

        Iterator<Book> iterator = books.iterator();
        boolean bookFound = false;

        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getId().equals(id)) {
                iterator.remove(); // Safely remove the book using iterator
                System.out.println("The book has been deleted.");
                bookFound = true;
                break;  // Exit loop after removing the book
            }
        }

        if (!bookFound) {
            System.out.println("No book found with that ID.");
        }

    }
    }
}
