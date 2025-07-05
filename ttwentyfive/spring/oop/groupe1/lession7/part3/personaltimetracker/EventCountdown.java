package ttwentyfive.spring.oop.groupe1.lession7.part3.personaltimetracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EventCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Capture current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        // 2. Prompt user to enter a future event date and time
        LocalDateTime eventDateTime = null;
        while (true) {
            System.out.print("Enter event date and time (e.g. 2025-12-31T15:00): ");
            String input = scanner.nextLine();
            try {
                eventDateTime = LocalDateTime.parse(input);
                if (eventDateTime.isAfter(now)) {
                    break;
                } else {
                    System.out.println("The date/time must be in the future.");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use the format: yyyy-MM-ddTHH:mm (e.g. 2025-12-31T15:00)");
            }
        }

        // 3. Calculate days until the event
        long daysUntil = ChronoUnit.DAYS.between(now.toLocalDate(), eventDateTime.toLocalDate());
        System.out.println("\nDays until the event: " + daysUntil + " day(s)");

        // 4. Format the event date in multiple formats
        System.out.println("\nEvent Date in Different Formats:");

        // ISO Format
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("ISO Format: " + eventDateTime.format(isoFormatter));

        // Long Custom Format
        DateTimeFormatter longFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy 'at' h:mm a");
        System.out.println("Long Format: " + eventDateTime.format(longFormatter));

        // Short Format
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        System.out.println("Short Format: " + eventDateTime.format(shortFormatter));
    }
}
