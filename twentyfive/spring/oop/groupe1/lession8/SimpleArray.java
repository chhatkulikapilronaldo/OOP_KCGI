package twentyfive.spring.oop.groupe1.lession8;

public class SimpleArray {
    public static void main(String[] args) {
        // Create an array of 5 student names
        String[] names = {"Kapil", "Anju", "Sita", "Ram", "Hari"};

        // Print all names using for-each loop
        System.out.println("Original names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Modify one name using normal for loop (change "Ram" to "Ravi")
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Ram")) {
                names[i] = "Ravi";
            }
        }

        // Print the modified names
        System.out.println("\nModified names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Bonus: Find the longest name
        String longest = names[0];
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }
        System.out.println("\nLongest name: " + longest);
    }
}

