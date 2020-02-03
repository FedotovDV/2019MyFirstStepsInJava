package homework;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            int number = scanner.nextInt();

        int i = 1;
        while (i < number / 10) {
            i *= 10;
        }
        int summa = 0;
        while (number > 1) {
            summa = summa + number / i;
            number = number % i;
            i /= 10;
        }
        System.out.print("Сумма  чисел составит: " + summa);
    }
}