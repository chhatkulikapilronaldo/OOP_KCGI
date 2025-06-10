package twentyfive.spring.oop.groupe1.lession7.classdiscuse;

public /*final*/ class Vehicle {
    protected String brand;
    // EXAMPLE OF OVERLOADING
    // notice here are two versions of the method honk()
    // first version does not accept any input, it does tooth only one time ...
    public void honk(){
        System.out.println("Tooth-Tooth done from " + brand);
    }

    // second version does accept one single byte input, it does tooth that many times, as big is the number you give it
    public void honk(byte reps){
        for (int i = 1; i <= reps; i++) {
            System.out.println(i + ". Tooth-Tooth from the loop dony by " + brand);
        }
    }

}
