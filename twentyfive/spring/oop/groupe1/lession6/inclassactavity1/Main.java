package twentyfive.spring.oop.groupe1.lession6.inclassactavity1;

public class Main {
    public static void main(String[] args) {

/*
        //Taking title and Author Name from user while using Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take book 1 info from user
        System.out.print("Enter title of Book 1: ");
        String title1 = scanner.nextLine();

        System.out.print("Enter author of Book 1: ");
        String author1 = scanner.nextLine();

        // Take book 2 info from user
        System.out.print("Enter title of Book 2: ");
        String title2 = scanner.nextLine();

        System.out.print("Enter author of Book 2: ");
        String author2 = scanner.nextLine();

        // Take user name
        System.out.print("Enter your full name: ");
        String userName = scanner.nextLine();
        */


        // Create books
        Book book1 = new Book("Java Programming", "BK");
        Book book2 = new Book("MunaMadhan", "Laxami Prasad");
        Book book3 = new Book("Python", " Prasad");

        // Create a  library user
        LibraryUser user = new LibraryUser("Kapil Chhatkuli");
        // Display user and book info
        user.displayUser();
        book1.displayInfo();
        book2.displayInfo();

        // Borrow first book
        book1.borrow();
        book1.displayInfo();

        // Borrow second book
        book2.borrow();
        book2.displayInfo();

        // Return first book
        book1.returnBook();
        book1.displayInfo();
        System.out.println( Book.getTotalCount());
        System.out.println( Book.getTotalBorrowedCount());
        System.out.println(Book.getTotalAvabibleCount());




    }
}

