package L04MethodsLab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            printTriangle(i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printTriangle(i);
        }
    }

    public static void printTriangle(int number){
        for (int i = 1; i <= number ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
