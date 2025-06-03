package twentyfive.spring.oop.groupe1.lession6.inclassactavity1;

public class TaskApp {
    public static void main(String[] args) {
        Task cleanDishes = new Task("Clean dirty dishies", "Just clean it before housemate will get back.", "low", "house stuff");
        Task personalTask = new Task("Plan weekend trip", "Personal");

        cleanDishes.displayTasks();
        cleanDishes.markAsCompleted();
        cleanDishes.displayTasks();

        Task.displayStatistics();
    }
}
