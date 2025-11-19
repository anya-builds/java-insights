package four;

import java.util.List;

class Library{
    int availableBooks = 3;
    public void borrowBook(int booksRequested){
        try{
            int[] books={101,102,103};
            System.out.println("Book Requested: " + books[booksRequested]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception occurred");
        }catch (NullPointerException e){
            System.out.println("Null exception");
        }finally {
            System.out.println("finally");
        }
    }
}
public class LibraryDemo {
    static void main(String[] args) {
        Library library=new Library();
        library.borrowBook(3);

    }
}
