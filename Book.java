 //create a book class for a library system.
 // instance variable : title , author, isbn.
 // Static variable : totalBook, a counter for the total number of book instances.
 // instance method : borrowBook(),returnBook()
 // static method : getTotalBook(),to get the number of books in the library.



public class Book {
    //static variable = static int TotalNoOfBooks
    static int totalNoOfBooks;
    // instance variable = string title,author,isbn
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowedBook() {
        if (isBorrowed) {
            System.out.println("book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }
    void  returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed,please leave a review");
        }else {
            System.out.println("this book is already in the library ");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1","Design","Author" );
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowedBook();
        myBook.borrowedBook();
        designOfThings.borrowedBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}

















