package homework;

import java.util.Scanner;

public class HomeworkArray {

    public static void main(String[] args) {
        int[] array = createIntArray();
        printArray(array);
        System.out.println("Произведение элементов массива = " + multiplicationArray(array));

    }

    public static int[] createIntArray() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер создаваемого массива ");
        int sizeArray = console.nextInt();
        if (sizeArray < 0) {
            System.out.print("Неправильный ввод, введите число >0  =>");
            sizeArray = console.nextInt();
        }
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = console.nextInt();
        }
        return array;

    }


    public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("}");
        System.out.println();
    }


    public static int multiplicationArray(int[] array) {

        int multArray = 1;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                multArray *= array[i];
            }
            return multArray;
        } else {
            return 0;
        }
    }


}
