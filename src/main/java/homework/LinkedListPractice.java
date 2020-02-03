package homework;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] array = new int[] {1,2,3,4,5,6};
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        array = switchIntoNewArray(0,1, array);
        System.out.println();
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    private static void switchIntoArray(int index1, int index2, int[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int[] switchIntoNewArray(int index1, int index2, int[] array) {
        int[] newArray = new int[array.length];

        for(int i = 0; i< array.length; i++){
            if(i== index1){
                newArray[i] = array[index2];
            } else if(i == index2) {
                newArray[i] = array[index1];
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}
