package twentyfive.spring.oop.groupe1.lession7.part3.enums;

// WeatherCondition.java
public enum WeatherCondition {
    SUNNY("Clear skies and bright sunlight", "Wear sunglasses and light clothing"),
    RAINY("Rainy weather with possible thunderstorms", "Bring an umbrella and wear a waterproof jacket"),
    CLOUDY("Overcast skies with little sunlight", "Wear a light jacket or sweater"),
    SNOWY("Cold weather with snowfall", "Wear a heavy coat, gloves, and boots");

    private final String description;
    private final String clothingRecommendation;

    WeatherCondition(String description, String clothingRecommendation) {
        this.description = description;
        this.clothingRecommendation = clothingRecommendation;
    }

    public String getDescription() {
        return description;
    }

    public String getClothingRecommendation() {
        return clothingRecommendation;
    }
}

