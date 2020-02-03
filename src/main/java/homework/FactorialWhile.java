package homework;

import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");// как перевести фокус ввода на строку после "Введите число"?
        int number = scanner.nextInt();
        int factorial = number;

        if (number > 0) {
            int i = 1;
            while (i < number) {
                factorial = factorial * (number - i);
                i++;
            }
            System.out.println("Факториал числа " + number + "! = " + factorial);
        } else if (number == 0) {
            factorial = 1;
            System.out.println("Факториал числа " + number + "! = " + factorial);
        } else {
            System.out.println("Число < 0, факториал не определен");
        }
    }
}
