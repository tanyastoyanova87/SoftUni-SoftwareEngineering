package L01FirstStepsInCoding;

import java.util.Scanner;

public class P02RadianstoDegrees2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radian = Double.parseDouble(scanner.nextLine());
        double degree = radian * 180/ Math.PI;

        System.out.println(degree);
    }
}
