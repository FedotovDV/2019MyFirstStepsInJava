package homework;

import java.util.Scanner;

public class ArraysPractice {


    public static void main(String[] args) {
        int elementOfArray;


        System.out.print("Введите размер массива:");
        Scanner console = new Scanner(System.in);

        int sizeArray = console.nextInt();
        if (sizeArray <= 0) {
            System.out.print("Неправильный ввод, введите число >0  =>");
            sizeArray = console.nextInt();
        }
        int[] youArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            youArray[i] = console.nextInt();
        }
        System.out.print("Получился массив: { ");
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(youArray[i] + " ");
        }
        System.out.print("}");

        int summaElementsArray = youArray[0];
        for (int i = 1; i < sizeArray; i++) {
            summaElementsArray += youArray[i];
        }
        System.out.println("\nСумма элементов массива = " + summaElementsArray);

        int maxElementsArray = youArray[0];
        int maxId = 0;
        for (int i = 1; i < sizeArray; i++) {
            elementOfArray = youArray[i];
            if (maxElementsArray < elementOfArray) {
                maxElementsArray = elementOfArray;
                maxId = i;
            }
        }
        System.out.println("Максимальный элемент массива = " + maxElementsArray);



        int minElementsArray = youArray[0];
        for (int i = 1; i < sizeArray; i++) {
            elementOfArray = youArray[i];
            if (minElementsArray > elementOfArray) {
                minElementsArray = elementOfArray;
            }
        }
        System.out.println("Минимальный элемент массива = " + minElementsArray);

        int secondMaxElementsArray = minElementsArray;
        for (int i = 0; i < sizeArray; i++) {
            elementOfArray = youArray[i];
            if (secondMaxElementsArray < elementOfArray && maxId != i) {
                secondMaxElementsArray = elementOfArray;
            }
        }
        System.out.println("Второй максимальный элемент массива = " + secondMaxElementsArray);
        System.out.println("Сумма двух максимальных элементов массива = " + (maxElementsArray + secondMaxElementsArray));

        int summaEven = 0;
        int multOdd = 1;
        int HowManyOdd = 0;
        for (int i = 0; i < sizeArray; i++) {
            elementOfArray = youArray[i];
            if (elementOfArray % 2 != 0) {
                multOdd *= elementOfArray;
                HowManyOdd++;
            } else {
                summaEven += elementOfArray;
            }
        }
        if(HowManyOdd==0) {
            multOdd = 0;
        }
        System.out.println("Сумма четных элементов массива = " + summaEven);
        System.out.println("Произведение нечетных элементов массива = " + multOdd);


        int summaEvenIndex = 0;
        for (int i = 0; i < sizeArray; i+=2) {
            elementOfArray = youArray[i];
            summaEvenIndex += elementOfArray;
        }
        System.out.println("Сумма элементов массива с четными индексами = " + summaEvenIndex);

        int multOddIndex = 1;
        if(sizeArray>1) {
            for (int i = 1; i < sizeArray; i += 2) {
                elementOfArray = youArray[i];
                multOddIndex *= elementOfArray;
            }
        }else {
            multOddIndex = 0;
        }
        System.out.println("Произведение элементов массива с нечетными индексами = " + multOddIndex);

    }
}



