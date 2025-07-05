package ttwentyfive.spring.oop.groupe1.assignment1.m24w7304;

public class CarSystem {

    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.name = "Ferrari F40";
        ferrari.color = 'r';
        ferrari.weight = 500;
        ferrari.petrol = true;
        ferrari.engine = "6 liters V12";
        // ferrari.number_of_wheels = 3; // Cannot assign to final variable

        ferrari.startEngine();
        ferrari.tellUsAboutYou();

        Car lamborghini = new Car();
        lamborghini.name = "Lamborghini Diablo";
        lamborghini.color = 'y';
        lamborghini.weight = 650;
        lamborghini.petrol = true;
        lamborghini.engine = "6.5 liters V12";

        lamborghini.startEngine();
        lamborghini.tellUsAboutYou();

        Car honda_tank = new Car("Honda Tank", 200, true, 'w', "tiny one 0.3liters");
        honda_tank.tellUsAboutYou();

        Car.muhehe();
    }
}

