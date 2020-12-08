package Book;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();
        Book b2 = new Book("Haunted", "ABCD", "H-250", "Horror", 5);

        System.out.println("Enter Book Name");
        String bookName = sc.nextLine();
        System.out.println("Enter Book Author Name");
        String bookAuthor = sc.nextLine();
        System.out.println("Enter Book Id");
        String bookId = sc.nextLine();
        System.out.println("Enter Book Type");
        String bookType = sc.nextLine();
        System.out.println("Enter Copy Of Book");
        int bookCopy = sc.nextInt();
        b1.setBookName(bookName);
        b1.setBookAuthor(bookAuthor);
        b1.setBookId(bookId);
        b1.setBookType(bookType);
        b1.setBookCopy(bookCopy);
        
        Library lib1 = new Library("AIUB", "Kuratoli", 5000);
        lib1.addNewBook(b1);
        lib1.addNewBook(b2);
        lib1.showLibInfo();

        sc.close();
    }
}
