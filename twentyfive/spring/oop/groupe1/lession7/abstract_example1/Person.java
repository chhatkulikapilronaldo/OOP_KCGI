package twentyfive.spring.oop.groupe1.lession7.abstract_example1;

public abstract class Person {
    private String name;
    private String surname;
    private byte age;
    private String id;

    public abstract void study(); // NOTICE HERE WE HAVE A METHOD WHICH IS INCOMPLETE - THERE IS NO "BODY" OF IT (WE ARE MISSING {})

    public void printFullName(){
        System.out.println(name + " " + surname);
    }
    // Constructor
    public Person(String name, String surname, byte age, String id){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }
    // Getters
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    // Setter
    public void setSurname(String newSurname){
        surname = newSurname;
    }

}
