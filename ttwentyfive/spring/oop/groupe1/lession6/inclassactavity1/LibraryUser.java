package ttwentyfive.spring.oop.groupe1.lession6.inclassactavity1;

public class LibraryUser {
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }
    public void displayUser() {
        System.out.println("Library User Name is: " + name);
    }
}

