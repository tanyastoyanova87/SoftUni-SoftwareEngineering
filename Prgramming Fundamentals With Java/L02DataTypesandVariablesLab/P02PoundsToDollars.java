package L02DataTypesАndVariablesLab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pounds = Integer.parseInt(scanner.nextLine());

        double poundsToDollars = pounds * 1.36;
        System.out.printf("%.3f%n", poundsToDollars);
    }
}
