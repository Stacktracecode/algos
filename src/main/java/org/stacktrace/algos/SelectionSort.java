package org.stacktrace.algos;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {6, 4, 5, 3, 2, 1};
        int min, temp =0;
        for (int i = 0; i<array.length; i++){

            min = i;
            for (int j = i+1; j<array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
