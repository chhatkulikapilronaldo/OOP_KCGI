package twentyfive.spring.oop.groupe1.lession6.inclassactavity1;

public class Book {
    private String title;
     private String author;
   private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));

    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book "+ title +" has been borrowed.");
        } else {
            System.out.println("Book "+ title +" is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book  "+ title +" has been returned.");
        } else {
            System.out.println("Book "+ title +" was not borrowed.");
        }
    }
}

