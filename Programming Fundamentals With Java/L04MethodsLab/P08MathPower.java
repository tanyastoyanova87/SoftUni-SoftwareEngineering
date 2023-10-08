package L04MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(printValue(num, power)));
    }

    public static double printValue(double num, double pow){
        double result = 1;

        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }
}
