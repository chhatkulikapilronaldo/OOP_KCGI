package ttwentyfive.spring.oop.groupe1.lession6.inclassactavity1;

public class Task {
    private String title;
    private String description;
    private String priority; // maybe betther to give it as byte data type?!
    private boolean isCompleted;
    private final String category;

    private static short  totalTasks = 0;
    private static short completedTasks = 0;

    public Task(String title, String description, String priority, String category) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
        this.category = category;
        totalTasks++;
    }

    public Task(String title, String category){
        this.title = title;
        this.description = "No description provided.";
        this.priority = "Medium";
        this.isCompleted = false;
        this.category = category;
        totalTasks++;
    }

    public Task(){
        this.title = "Untitled Task";
        this.description = "No description provided.";
        this.priority = "Low";
        this.isCompleted = false;
        this.category = "General";
        totalTasks++;
    }

    public void displayTasks(){
        System.out.println("===Task Details===");
        System.out.println("Title: " + title);
        System.out.println("Desc: " + description);
        System.out.println("Priority: " +priority);
        System.out.println("Status: " + (isCompleted? "COMPLETED" : "TO-DO"));
        System.out.println("Category: " + category);
    }

    public void markAsCompleted(){
        if(!isCompleted){
            isCompleted = true;
            completedTasks++;
            System.out.println("Task: " + title + " marked as completed.");
        }else{
            System.out.println("Task: " + title + " is already completed.");
        }
    }

    public void markAsIncompleted(){
        if(isCompleted){
            isCompleted = false;
            completedTasks++;
            System.out.println("Task: " + title + " marked as incompleted.");
        }else{
            System.out.println("Task: " + title + " is already incompleted.");
        }
    }

    public static short getTotalTasks(){
        return totalTasks;
    }
    public static short getCompletedTasks(){
        return completedTasks;
    }
    public static short getPendingTasks(){
        return (short) (getTotalTasks() - getCompletedTasks());
    }

    public static void displayStatistics(){
        System.out.println("===Statistics===");
        System.out.println("Total tasks: " + getTotalTasks());
        System.out.println("Completed tasks: " + getCompletedTasks());
        System.out.println("Pending tasks: " + getPendingTasks());
        System.out.println("Completion rate: " + ((totalTasks>0) ? (double)(completedTasks/totalTasks) * 100 : 0) + "%.");
    }
}
