package ttwentyfive.spring.oop.groupe1.lession6.inclassactavity1;

public class Book {

    private String title;
     private String author;
   private boolean isBorrowed;
   private static short totalCount=0;
    private static short totalBorrowedCount=0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;

        totalCount++;
    }
public static short getTotalCount() {
        return totalCount;
}
    public static short getTotalBorrowedCount() {
        return totalBorrowedCount;
    }
    public static short getTotalAvabibleCount(){
        return (short) (getTotalCount()-getTotalBorrowedCount());

    }


    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));

    }


    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            totalBorrowedCount++;
            System.out.println("Book "+ title +" has been borrowed.");
        } else {
            System.out.println("Book "+ title +" is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            totalBorrowedCount--;
            System.out.println("Book  "+ title +" has been returned.");
        } else {
            System.out.println("Book "+ title +" was not borrowed.");
        }
    }
}

