package homework;

import java.util.Arrays;

public class MergePractice {

    public static void main(String[] args) {
        int[] myArr = new int[]{5, 2, 4, 6, 1, 3, 2, 6};
        System.out.println("Исходный массив: ");
        printArray(myArr);
        System.out.println(" sortArrayMerge");
        long startTime = System.nanoTime();
        sortArrayMerge(myArr, 0, myArr.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Отсортированный массив: ");
        System.out.println("Total Time in Neno Second: "+ (endTime-startTime));
        printArray(myArr);
        myArr = new int[]{5, 2, 4, 6, 1, 3, 2, 6};
        System.out.println(" SortUnsorted");
        startTime = System.nanoTime();
        SortUnsorted(myArr, 0, myArr.length - 1);
        endTime = System.nanoTime();
        System.out.println("Отсортированный массив: ");
        System.out.println("Total Time in Neno Second: "+ (endTime-startTime));
        printArray(myArr);
    }

    private static void sortArrayMerge(int[] myArr, int firstIndex, int lastIndex) {
        if (lastIndex >= myArr.length) {
            System.out.println("\u001B[31mНеправильно заданы параметры ввода!\u001B[0m");
            return;
        }
        if (lastIndex <= firstIndex) {
            return;
        }
        int midleIndex = (lastIndex + firstIndex) / 2;
        sortArrayMerge(myArr, firstIndex, midleIndex);
        sortArrayMerge(myArr, midleIndex + 1, lastIndex);
        mergeArray(myArr, firstIndex, midleIndex, lastIndex);


    }

    private static void mergeArray(int[] myArr, int firstIndex, int midleIndex, int lastIndex) {
        int[] tempArr = new int[myArr.length];
        int i = firstIndex;
        int n = firstIndex;
        int k = midleIndex + 1;
        while ((i <= midleIndex) && (k <= lastIndex)) {
            if (myArr[i] <= myArr[k]) {
                tempArr[n] = myArr[i];
                i++;
            } else {
                tempArr[n] = myArr[k];
                k++;
            }
            n++;
        }
        while (i <= midleIndex) {
            tempArr[n] = myArr[i];
            i++;
            n++;
        }
        while (k <= lastIndex) {
            tempArr[n] = myArr[k];
            k++;
            n++;
        }
        for (int j = firstIndex; j <= lastIndex; j++)
            myArr[j] = tempArr[j];
        printArray(myArr);
    }


    private static void SortUnsorted(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
        printArray(a);
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
