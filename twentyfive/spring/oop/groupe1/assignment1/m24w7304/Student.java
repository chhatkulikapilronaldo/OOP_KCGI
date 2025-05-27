package twentyfive.spring.oop.groupe1.assignment1.m24w7304;

public class Student {
    // instance attributes - belong to each object
    private String studentId;
    private String name;
    private String surname;
    private byte age;
    private float gpa;
    private final String university = "KCGI"; // final - can not change!

    // static attribute - belong to class (not object/instance)
    private static int totalStudents = 0;

    // constructor with all parameters
    public Student(String studentId, String name, String surname, byte age, float gpa){
        if(studentId.charAt(0) == 'M' && studentId.charAt(3) == 'W'){
            // this class attribute studentId = parameter studentId;
            this.studentId = studentId;
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.gpa = gpa;
            totalStudents++;
        }else{
            System.out.println("Student ID you provided is prohibited.");
        }
    }

    // default constructor
    /*public Student(){
        studentId = "Not set";
        this.name = "Unknow";
        this.surname = "Unknow";
        this.age = 0;
        this.gpa = 0;
    }*/

    // setters - another special method (allow us to set values into private attributes)
    // best practice worldwide is to make all your attributes private
    // then create setters only for those class attributes you want user of your class to be "changeable"
    public void setSurname(String surname){
        // this middle step might seem like complicating things
        // but thing is that we are in charge to do some kind of self-defence security check before assigning a value directly into the class attribute
        this.surname = surname;
    }

    public void setAge(byte age){
        if(age<this.age){
            System.out.println("Not valid. You can not get younger.");
        }else{
            this.age = age;
        }
    }

    // getters - another special method (allow us to read private information)
    public byte getAge(){
        return age;
    }

    public static int getTotalStudents(){
        return totalStudents;
    }

    // instance methods - need object to call
    public void displayInfo(){
        System.out.println("Student reporting to duty:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("University: " + university);
    }

    public void study(String subject){
        System.out.println(name + " is studying " + subject);;
    }

}
