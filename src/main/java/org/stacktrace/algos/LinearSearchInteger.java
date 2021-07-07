package org.stacktrace.algos;

public class LinearSearchInteger {

    public static void main(String[] args) {
        int[] array = {8,6,4,2,9,7};

        int item = 7;
        int temp = 0;
        for (int i = 0; i < array.length; i++){

                if (array[i] == item) {
                    System.out.println("Item is present at " + i + " Index position");
                    temp = temp + 1;
                }
        }
        // If, I want search element available or not in array
        if (temp == 0){
            System.out.println("Item not found in list");
        }
    }
}
