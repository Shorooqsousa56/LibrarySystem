
import java.util.Scanner;
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
          boolean check=true;

        while (check) {
            System.out.println("* __MENU__ *");
            System.out.println("1-Add Book\n" +
                    "2-Show All Books\n" +
                    "3-Search Book by Title\n" +
                    "4-Delete Book\n" +
                    "5-Exit");
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                System.out.println("Please enter the book's ID, title, author, and year to add it to the collection.");
                library.AddBook(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                break;
            case "2":  System.out.println("The list of books available in the library.");
            library.getBooks();
                break;
            case "3":System.out.println(" enter the book title to search .");
                library.getBooksByTitle(sc.nextLine());
                break;
            case "4":System.out.println(" enter the book ID to delete it.");
                library.deleteBooksById(sc.nextLine());
                break;
            case "5":check=false;
                break;
            default:System.out.println(" invalid choice.");

        }
    }

    }
}

