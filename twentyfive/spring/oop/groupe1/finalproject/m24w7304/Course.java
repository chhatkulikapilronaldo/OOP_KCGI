package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

public class Course {
    private final int courseId;
    private final String title;
    private final int creditHours;

    // Constructor
    public Course(int courseId, String title, int creditHours) {
        this.courseId = courseId;
        this.title = title;
        this.creditHours = creditHours;
    }

    // ✅ Getters
    public int getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    // ✅ toString for easy printing
    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", creditHours=" + creditHours +
                '}';
    }
}
