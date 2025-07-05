package ttwentyfive.spring.oop.groupe1.linkedlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

// Class to manage a list of Task objects
public class TaskManager {

    // Create a LinkedList to hold Task objects
    private LinkedList<Task> tasks;

    // Constructor
    public TaskManager() {
        tasks = new LinkedList<>();  // Initialize empty task list
    }

    // Add a task at the beginning of the list
    public void addTaskFirst(Task task) {
        tasks.addFirst(task);  // Adds the task to the front
    }

    // Add a task at the end of the list
    public void addTaskLast(Task task) {
        tasks.addLast(task);   // Adds the task to the end
    }

    // Remove a task by its name
    public void removeTaskByName(String name) {
        // Remove the task if its name (ignoring case) matches the given name
        tasks.removeIf(task -> task.getName().equalsIgnoreCase(name));
    }

    // Display all tasks in the list
    public void displayAllTasks() {
        // If there are no tasks, show a message
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            for (Task task : tasks) {
                System.out.println(task); // Calls task.toString()
            }
        }
    }

    // Find tasks by responsible person's name
    public LinkedList<Task> findTasksByResponsiblePerson(String person) {
        LinkedList<Task> result = new LinkedList<>(); // Create a new list for matched tasks

        // Check each task
        for (Task task : tasks) {
            // If responsible person matches, add to result
            if (task.getResponsiblePerson().equalsIgnoreCase(person)) {
                result.add(task);
            }
        }

        return result; // Return the list of tasks found
    }

    //  deadline (if formatted like "yyyy-MM-dd, HH:mm")
    public void sortTasksByDeadline() {
        // Sort tasks based on deadline string
        Collections.sort(tasks, Comparator.comparing(Task::getDeadline));
    }

    // Main method to test our TaskManager
    public static void main(String[] args) {
        //Create a TaskManager object
        TaskManager taskManager = new TaskManager();

        // Create 3 Task objects
        Task pickupKids = new Task(
                "Samantha",
                "Edward",
                "2024-12-05, 15:00",
                "Go to the garage and pick up your kids",
                "Pick up kids"
        );

        Task cookDinner = new Task(
                "Edward",
                "Edward",
                "2024-12-05, 19:00",
                "Cook dinner for the family",
                "Cook the dinner"
        );

        Task visitGrandmother = new Task(
                "Julian",
                "Edward",
                "2024-12-05, 18:00",
                "Prepare for grandmother's visit",
                "Prepare for grandmother"
        );

        // Add the tasks to the list
        taskManager.addTaskFirst(pickupKids);       // Add at the beginning
        taskManager.addTaskLast(cookDinner);        // Add at the end
        taskManager.addTaskLast(visitGrandmother);  // Add at the end

        // Show all tasks
        System.out.println("All Tasks:");
        taskManager.displayAllTasks();  // Show all tasks in the list

        // Show tasks for Edward only
        System.out.println("\nTasks for Edward:");
        LinkedList<Task> edwardTasks = taskManager.findTasksByResponsiblePerson("Edward");


       // System.out.println(edwardTasks);

       for (Task task : edwardTasks) {
            System.out.println(task);
        }


        // Remove task with name "Pick up kids"
        System.out.println("\nRemoving 'Pick up kids' task:");
        taskManager.removeTaskByName("Pick up kids");

        // Show tasks after removal
        taskManager.displayAllTasks();

        // task Sort by deadline and show
        System.out.println("\nTasks Sorted by Deadline:");
        taskManager.sortTasksByDeadline();
        taskManager.displayAllTasks();
    }
}
