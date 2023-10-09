package L04MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] digits = Arrays.stream(scanner.nextLine()
                                .split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();

        System.out.println(getMultipleOfEvensAndOdds(number));

    }

    public static int getMultipleOfEvensAndOdds(int number) {

        return number;
    }

    public static int getEvenSum(int[] digits, int number) {
        int evenSum = 0;

        for (int i = 0; i < digits.length; i++) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
                number /= 10;
            }
        }
        return evenSum;
    }

    public static int getOddSum(int[] digits, int number) {
        int oddSum = 0;

        for (int i = 0; i < digits.length; i++) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                oddSum += lastDigit;
                number /= 10;
            }
        }
        return oddSum;
    }
}
