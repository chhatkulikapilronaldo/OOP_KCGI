package ttwentyfive.spring.oop.groupe1.lession7.inheritance;

public class Vehicle {
    private String brand;
    public void honk(){
        System.out.println("Tooot-tooot");
    }
    //overloading - single method has many versions
    public void honk(byte reps){
        for (byte i = 0; i < reps; i++) {
            System.out.println("Tooot-tooot from the loop!");
        }
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
}
