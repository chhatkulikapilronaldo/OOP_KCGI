package twentyfive.spring.oop.groupe1.lession7.inheritance;

public class Airplane extends Vehicle{
    // overriding parent's function honk() with the local-new-version
    public void honk(){
        System.out.println("Airplanes do not honk!");
    }
}
