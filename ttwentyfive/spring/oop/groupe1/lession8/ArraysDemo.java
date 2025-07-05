package ttwentyfive.spring.oop.groupe1.lession8;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] cars = {"Mazda", "Suzuki", "Honda", "Toyota", "Lexus", "Kawasaki", "Mitsubishi", "Nissan"};

        System.out.println(cars[5]); // before the change // READ
        cars[5] = "Mazda"; // WRITE
        System.out.println(cars[5]); // after rewriting item on 4th index

        System.out.println("There are: " + cars.length + " cars in our array.");

        // very ugly - doing it manually ..., but for explanation ... => AVOID DOING REPETITIVE STUFF MANUALLY
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars[4]);
        System.out.println(cars[5]);
        //System.out.println(cars[6]); // not defined -> ERROR!

        for (int index = 0; index < cars.length; index++) {
            System.out.println(index + ". " + cars[index]);
        }

        // foreach loop - it's made for each item, we go for each, therefore from first, to the last, one by one ..., so we do not have to bother with index at all ...
        for (String single_car : cars){
            System.out.println(single_car);
        }

        // foreach work for each item, whereas the standard for loop can be tuned for strange, sometimes needed behavior such as:
        // for (int index = 2; index < cars.length-1; index+=2){

        System.out.println("----------------------------------------------------------------");
        System.out.println(cars.length); //0-7 indexes ...
        //cars[8] = "BMW"; // PROOF THAT ARRAYS CAN NOT CHANGE THEIR SIZE

        System.out.println("----------------------------------------------------------------");
        byte[][] points = {
                {-1,1}, // point A coords[x,y]
                { 1,1} // point B coords
        };

        for (byte[] point : points){
            for (byte specific_coordinates: point){
                System.out.print(specific_coordinates + ", "); // notice print without line - will print all onto one single line
            }
            System.out.println(); // notice print line - will print line!
        }

        System.out.println("=============================================================");

        byte [][] tanks = {
                {1, 1}, // our tank location
                {5, 4}, // enemy tank
                {1, 4} // our bullet
        };

        for (int object_in_our_game_index = 0; object_in_our_game_index < tanks.length; object_in_our_game_index++) {
            for (int specific_data_index = 0; specific_data_index < tanks[object_in_our_game_index].length; specific_data_index++) {
                System.out.print(tanks[object_in_our_game_index][specific_data_index] + ",");
            }
            System.out.println();
        }

        System.out.println("=============================================================");

        byte[][] points_3d = {
                {1,1,1}, //A
                {-1,-1,-1}, //B
                {-2,1,2}  //C
        };

        for (byte[] single_point:points_3d){
            for(byte specific_data:single_point){
                System.out.print(specific_data + ",");
            }
            System.out.println();
        }

    }
}
