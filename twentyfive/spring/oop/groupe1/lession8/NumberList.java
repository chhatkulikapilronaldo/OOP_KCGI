package twentyfive.spring.oop.groupe1.lession8;

import java.util.ArrayList;
import java.util.Collections;

public class NumberList {
    public static void main(String[] args) {
        // Create an ArrayList and add 6 numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(10);
        numbers.add(55);
        numbers.add(30);
        numbers.add(5);
        numbers.add(70);

        // Step 2: Find and print the highest and lowest (before sorting)
        findHighLow(numbers);

        // Step 3: Sort the list
        Collections.sort(numbers);
        System.out.println("\nSorted list (ascending): " + numbers);


        numbers.remove(Integer.valueOf(30));  // Use Integer.valueOf to avoid removing by index
        System.out.println("List after removing 30: " + numbers);
    }

    // Method to find and print the highest and lowest numbers
    public static void findHighLow(ArrayList<Integer> list) {
        int highest = list.get(0);
        int lowest = list.get(0);

        for (int num : list) {
            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
        }

        System.out.println("Original list: " + list);
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}

