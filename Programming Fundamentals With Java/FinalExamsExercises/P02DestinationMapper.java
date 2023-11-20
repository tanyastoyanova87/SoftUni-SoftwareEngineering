package FinalExamsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("=(?<destination>[A-Z][A-Za-z]{2,})=|/(?<destination2>[A-Z][A-Za-z]{2,})/");
        Matcher matcher = pattern.matcher(text);

        List<String> destinations = new ArrayList<>();
        while (matcher.find()) {

            String destination = matcher.group("destination");
            String destination2 = matcher.group("destination2");
            if (destination != null) {
                destinations.add(destination);
            }

            if (destination2 != null) {
                destinations.add(destination2);
            }
        }

        int travelPoints = 0;
        for (String destination : destinations) {
            travelPoints += destination.length();
        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinations));

        System.out.println("Travel Points: " + travelPoints);
    }
}
