package homework;

import java.util.Scanner;

public class InputNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Попробуйте угадать число от 1 до 10, ");
        int number = 1;
        while (number != 7) {
            System.out.println(" введите число:");
            number = scanner.nextInt();
            if (number != 7) {
                System.out.print("еще разок");
            }
        }
        System.out.println(", о нет, Вы выйграли миллион!!!!!!!!!!");
    }

}
