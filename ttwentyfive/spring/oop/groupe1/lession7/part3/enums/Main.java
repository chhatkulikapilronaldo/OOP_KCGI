package ttwentyfive.spring.oop.groupe1.lession7.part3.enums;
// Main.java
public class Main {
    public static void main(String[] args) {
        // Switch statement demo
        WeatherCondition today = WeatherCondition.RAINY;

        System.out.println("Today's weather:");
        switch (today) {
            case SUNNY:
                System.out.println("It's a beautiful sunny day!");
                break;
            case RAINY:
                System.out.println("Don't forget your umbrella!");
                break;
            case CLOUDY:
                System.out.println("Looks a bit gloomy outside.");
                break;
            case SNOWY:
                System.out.println("Stay warm out there!");
                break;
        }

        System.out.println("\nWeather Forecast:");
        for (WeatherCondition condition : WeatherCondition.values()) {
            System.out.println("Condition: " + condition);
            System.out.println("Description: " + condition.getDescription());
            System.out.println("Clothing Recommendation: " + condition.getClothingRecommendation());
            System.out.println();
        }
    }
}
