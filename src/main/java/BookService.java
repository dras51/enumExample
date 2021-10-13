import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> booklist = new ArrayList<>();

    //Adding Books to the list
    public void addBook(Book book){
        this.booklist.add(book);
    }

    //Removing books from the list
    public void removeBook(Book book){
        this.booklist.remove(book);
    }

    //returning a list of all books
    public ArrayList<Book> listBooks() {
        return booklist;
    }

    //returning a list of books by Fantasy type
    public ArrayList<Book> listByTypeFantasy () {

        ArrayList<Book> booksByFantasy = new ArrayList<>();

        //book.getGenre() returns a type of ENUM constant e.g GenreType.FANTASY
        //book.getGenre().name() converts the ENUM constant to string
        for(Book book: booklist) {
            if(book.getGenre().equals(GenreType.FANTASY)) {
                booksByFantasy.add(book);
            }
        }

        return booksByFantasy;
    }

    //returning a list of books released before 1999

    public ArrayList<Book> listOfBooksBefore1999() {
        ArrayList<Book> booksBefore1999  = new ArrayList<>();

        for(Book book: booklist) {
            if(book.getYear() < 1999) {
                booksBefore1999.add(book);
            }
        }

        return booksBefore1999;
    }

    //returning the most expensive book
    public Book mostExpensiveBook() {
        //Variable that stores the book thats most expensive and set the initial value to the first book in the array.
        Book mostExpensive = booklist.get(0);

        for (Book book: booklist){
            if(book.getPrice() > mostExpensive.getPrice()){
                mostExpensive = book;
            }
        }

        return mostExpensive;
    }

    //returning the cheapest book
    public Book cheapestBook() {
        Book cheapestBook = booklist.get(0);

        for (Book book: booklist){
            if(book.getPrice() < cheapestBook.getPrice()){
                cheapestBook = book;
            }
        }

        return cheapestBook;
    }

    //returning a book written by 3 authors
    public Book bookByThreeAuthors() {
        for(Book book: booklist){
            if(book.getAuthors().size() == 3){
                return book;
            }
        }

        return null;
    }

    //verifying a book is on the list
    public Boolean verifyBook(Book book) {
        //booklist.contains() is a method in the ArrayList that returns true if the item is present in the array list
        return booklist.contains(book);
    }

    //Method that returns an arrayList of books.
    public ArrayList<Book> listBookByAuthor(Author providedAuthor) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();

        for(Book book: booklist){
            for(Author currentAuthor: book.getAuthors()){
                if(providedAuthor.equals(currentAuthor)){
                    booksByAuthor.add(book);
                }
            }
        }

        return booksByAuthor;
    }
}
//