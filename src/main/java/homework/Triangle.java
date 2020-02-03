package homework;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        System.out.println("Введите размеры сторон треугольника:");
        System.out.println("Введите сторону а:");
        double a = inputCheck();
        System.out.println("Введите сторону b:");
        double b = inputCheck();
        System.out.println("Введите сторону c:");
        double c = inputCheck();
        if (checkTriangle(a, b, c)) {
            System.out.println("Периметр данного треугольника =" + perimetrTriangle(a, b, c));
            System.out.println("Площадь данного треугольника =" + squareTriangle(a, b, c));
        }
    }


    private static double squareTriangle(double a, double b, double c) {
        double p = perimetrTriangle(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double perimetrTriangle(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    private static boolean checkTriangle(double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            System.out.println("Треугольник построить можно");
            return true;
        } else {
            System.out.println("Треугольник с такими сторонами построить нельзя!");
            return false;
        }
    }

    private static double inputCheck() {
        Scanner inputConsole = new Scanner(System.in);
        double number = inputConsole.nextInt();
        while (number <= 0) {
            System.out.print("Неправильный ввод, введите число >0 \n");
            number = inputConsole.nextInt();
        }
        return number;
    }
}
