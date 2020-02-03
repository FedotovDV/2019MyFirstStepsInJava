package homework;

public class RecursivePractice {
    public static void main(String[] args) {
        int[] myArr = new int[]{6, 42, 3, 8, 22, 15, 7};
        System.out.println("Исходный массив: ");
        printArray(myArr);
        sortArrayRecursive(myArr, myArr.length);
        System.out.println("Отсортированный массив: ");
        printArray(myArr);
        int searchElement = 22;
        int searchIndex = binarySearch(searchElement, myArr, 0, myArr.length - 1);
        if (searchIndex < 0) {
            System.out.println("\nТакого элемента нет в массиве");
        } else {
            System.out.println("\nНайден элемент массива: ");
            System.out.print(myArr[searchIndex]);
        }
    }

    static void sortArrayRecursive(int[] array, int lastIndex) {
        if (lastIndex <= 1) {
            return;
        }
        sortArrayRecursive(array, lastIndex - 1);
        int lastElement = array[lastIndex - 1];
        int j = lastIndex - 2;
        while (j >= 0 && array[j] > lastElement) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = lastElement;
    }

    static int binarySearch(int searchElement, int[] array, int leftIndex, int rihtgIndex) {

        int searchIndex;

        if (leftIndex > rihtgIndex) {
            return -1;
        }
        searchIndex = (leftIndex + rihtgIndex) / 2;
        if (searchElement == array[searchIndex]) {
            return searchIndex;
        }

        if (searchElement > array[searchIndex]) {
            return binarySearch(searchElement, array, searchIndex + 1, rihtgIndex);
        }

        if (searchElement < array[searchIndex]) {
            return binarySearch(searchElement, array, leftIndex, searchIndex - 1);
        }

        return searchIndex;

    }
    static void printArray(int[] array) {
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
}
