package Book;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy;

    //Default or Empty Constructor
    public Book()
    {
        //By Default All Things Are Empty
        bookName="";
        bookAuthor="";
        bookId="";
        bookType="";
        bookCopy=0;
    }

    //Perameteraised Constructor
    public Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy)
    {
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.bookId=bookId;
        this.bookType=bookType;
        this.bookCopy=bookCopy;
    }

    //setter and getter method
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public void setBookCopy(int bookCopy) {
        this.bookCopy = bookCopy;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public int getBookCopy() {
        return bookCopy;
    }
    public String getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public String getBookType() {
        return bookType;
    }
    
    public void addCopy(int copies)
    {
        bookCopy+=copies;
        System.out.println(copies+" Copies Added To Following Book");
        showInfo();
    }

    public void showInfo()
    {
        System.out.println("-------Book Details-------");
        System.out.println("Book Name:"+getBookName());
        System.out.println("Book Author:"+getBookAuthor());
        System.out.println("Book Id:"+getBookId());
        System.out.println("Book Type:"+getBookType());
        System.out.println("Total Copy Of Books:"+getBookCopy());
        System.out.println("--------------------------");
    }
}
