package Book;


public class Library{

    private String libName;
    private String libAddress;
    private int totalBook;
    private Book[] books ;

    //default Constructor
    public Library(){}
    //perameteraised Constructor
    public Library(String libName,String libAddress,int totalBook)
    {
        this.libName=libName;
        this.libAddress=libAddress;
        books = new Book[totalBook];
        this.totalBook=totalBook;
    }

    //setter and getter method
    public void setBooks(Book[] books) {
        this.books = books;
    }
    public void setLibAddress(String libAddress) {
        this.libAddress = libAddress;
    }
    public void setLibName(String libName) {
        this.libName = libName;
    }
    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }
    public Book[] getBooks() {
        return books;
    }
    public String getLibAddress() {
        return libAddress;
    }
    public String getLibName() {
        return libName;
    }
    public int getTotalBook() {
        return totalBook;
    }

    //Adding Books
    public void addNewBook(Book book)
    {
        int count=0;
        boolean flag = false;
        for(int i=0;i<books.length;i++)
        {
            if(books[i]==null)
            {
                books[i]=book;
                flag=true;
                count=i+1;
                break;
            }
        }
        if(flag==true){System.out.println("No."+count+" Book Inserted");}
        else{System.out.println("Book Not Inserted");}
    }

    //Adding Books Copy
    public void addNewBookCopy(Book book,int copy)
    {
        boolean flag = false;
        for(int i=0;i<books.length;i++)
        {
            if(books[i].getBookName().equalsIgnoreCase(book.getBookName()))
            {
                books[i].addCopy(copy);
                flag=true;
            }
        }
        if(flag==true){System.out.println("Books Copy Added");}
        else{System.out.println("Book Not Found");}
    }

    //Display Whole Library
    public void showLibInfo()
    {
        System.out.println("---------Library Details---------");
        System.out.println("Library Name:"+getLibName());
        System.out.println("Library Address:"+getLibAddress());
        System.out.println("Total Book Storage Capacity Of Libray:"+getTotalBook());
        for(Book b : books)
        {
            if(b !=null)
            {
                b.showInfo();
            }
        }

    }

}