package ttwentyfive.spring.oop.groupe1.lession7.encapsulation;
class Student {
    private String name;
    private int age;
    private double gpa;

   //Getter and Setter for name
    public String getName() {

        return name;
    }
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Name cannot be empty.");
        }
    }

    //Getter and Setter for age with validation
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 125) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be between 1 and 100.");
        }
    }

    //Getter and Setter for GPA with validation
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA! GPA must be between 0.0 and 4.0.");
        }
    }

    //display name,age,GPA
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
}

