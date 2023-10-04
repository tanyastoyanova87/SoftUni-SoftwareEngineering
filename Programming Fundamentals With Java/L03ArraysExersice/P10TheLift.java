package L03ArraysExersice;

import java.util.Arrays;
import java.util.Scanner;

public class P10TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());

        int[] liftState = Arrays.stream(scanner.nextLine()
                                .split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();

        while (peopleWaiting > 0){


            for (int i = 0; i < liftState.length; i++) {
                int currentNum = liftState[i];

                
            }
        }
    }
}
