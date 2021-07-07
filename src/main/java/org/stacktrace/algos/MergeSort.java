package org.stacktrace.algos;

public class MergeSort {

    int[] array;
    int[] tempMergeArray;
    int length;

    public static void main(String[] args) {

        int[] inputArray = {48, 36, 13, 52, 19, 94, 21};
        MergeSort ms = new MergeSort();
        ms.sort(inputArray);

        for (Integer i : inputArray){
            System.out.print(i+" ");
        }
    }
    public void sort(int inputArray[]){
           this.array = inputArray;
           this.length = inputArray.length;
           this.tempMergeArray = new int[length];
           divideArray(0, length-1);
    }
    public void divideArray(int loverIndex, int higherIndex){
        // Recursive logic
        if (loverIndex<higherIndex){
            int middle = loverIndex + (higherIndex - loverIndex)/2;

            // It will sort the left side of an array
            divideArray(loverIndex, middle);

            // It will sort the right side of an array
            divideArray(middle + 1, higherIndex);

            mergeArray(loverIndex, middle, higherIndex);
        }
    }
    public void mergeArray(int lowerIndex, int middle, int higherIndex){

        for (int i = lowerIndex; i <= higherIndex; i++){
            // All the value of array copy to tempMergeArray
            tempMergeArray[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex){

            if (tempMergeArray[i] <= tempMergeArray[j]){
                array[k] = tempMergeArray[i];
                i++;
            }else {
                array[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle){
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }

    }
}
