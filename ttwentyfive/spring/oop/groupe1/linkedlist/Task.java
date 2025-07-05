package ttwentyfive.spring.oop.groupe1.linkedlist;

public class Task {
    private String author;
    private String responsiblePerson;
    private String deadline;
    private String note;
    private String name;

    // Constructor to set all values when creating a task
    public Task(String author, String responsiblePerson, String deadline, String note, String name) {
        this.author = author;
        this.responsiblePerson = responsiblePerson;
        this.deadline = deadline;
        this.note = note;
        this.name = name;
    }


    public String getResponsiblePerson() {

        return responsiblePerson;
    }

    public String getDeadline() {

        return deadline;
    }


    public String getName() {

        return name;
    }

    // Convert Task to string for printing
    @Override
    public String toString() {
        return "Task: " + name + "\nAuthor: " + author +
                "\nResponsible: " + responsiblePerson +
                "\nDeadline: " + deadline +
                "\nNote: " + note + "\n";
    }
}
