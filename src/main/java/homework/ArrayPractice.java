package homework;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 10, 7, -1, 69, 3};
        System.out.println(Arrays.toString(array));
        for(int j=1; j<array.length;j++) {
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
