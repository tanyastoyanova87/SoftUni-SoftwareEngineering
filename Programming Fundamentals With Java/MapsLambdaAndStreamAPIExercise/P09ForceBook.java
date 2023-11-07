package MapsLambdaAndStreamAPIExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];

                if (!teams.containsKey(team)) {
                    teams.put(team, new ArrayList<>());
                }
                boolean isExist = false;

                for (List<String> list : teams.values()) {
                    if (list.contains(player)) {
                        isExist = true;
                        break;
                    }
                }

                if (!isExist) {
                    teams.get(team).add(player);
                }
            } else if (input.contains(" -> ")) {
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];

                teams.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(player));

                if (!teams.containsKey(team)) {
                    teams.put(team, new ArrayList<>());
                    teams.get(team).add(player);
                }
                else {
                    teams.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n", player, team);
            }
            input = scanner.nextLine();
        }

        teams.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0) //оставяме само тези записи, които отговарят на условието
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
