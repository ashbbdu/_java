package ClassAndObjects;

public class Book {

    String title;
    String author;
    String isbn;
    static int totalBooks;
    boolean isBorrowed;


//    this block will set the number of books to 0 as soon as the class will instantiate and will run only once no matter how many instance of the class is created
    static {
        System.out.println("Static method is called");
        totalBooks = 0;
    }
    {
        totalBooks++; // need to understand this
    }

    public void borrowBook () {
        System.out.println("Book borrowed");
        if(isBorrowed) {
            System.out.println("Book is not available !");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book !");
        }
    }

    public void returnBook () {
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed");
        } else  {
            System.out.println("This is already in the library");
        }
    }

    public static int getTotalBooks () {
        return totalBooks ;
    }

//    constructor

    Book (String _title , String _author , String _isbn , boolean _isBorrowed) {
        this.title = _title;
        this.author = _author;
        this.isbn = _isbn;
        this.isBorrowed = _isBorrowed;
    }

//    another constructor , which will say you need at least isbn to create a book , this is construction chaining

    Book (String _isbn) {
        this("Unknown" , "Unknown" , _isbn , false);
    }

    public static void main(String[] args) {

        Book b1 = new Book("To the new" , "Ashish Srivastava"  , "ISBN12" , false);
        System.out.println(b1.author);



        Book b2 = new Book("12");
//        Book b3 = new Book();//        System.out.println(b1.author);
//        System.out.println(b1.title);

        System.out.println(Book.getTotalBooks());

    }
}
