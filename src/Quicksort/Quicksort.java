package Quicksort;

public class Quicksort {

    //StartingIndex is the numbers left of pivot
    //EndingIndex is the number right of pivot
    //Array[] is the array we want to sort.
    private int partition(int array[], int startingIndex, int endingIndex)
    {
        int pivot = array[endingIndex];
        int i = (startingIndex-1);
        for (int j = startingIndex; j < endingIndex; j++) {

            //If the current element is smaller than
            // or equal to pivot...
            if (array[j] <= pivot) {
                i++;

                //Then swap array[i] and array[j]
                int temporary = array[i];
                array[i] = array[j];
                array[j] = temporary;
            }
        }

        //Or else swap array[i+1] and array[high]
        //(Or swap the pivot)
        int temporary = array[i+1];
        array[i+1] = array[endingIndex];
        array[endingIndex] = temporary;

        return i+1;
    }


    private void quickSort(int array[], int startingIndex, int endingIndex)
    {
        if (startingIndex < endingIndex) {
            int partitioningIndex = partition(array, startingIndex, endingIndex);

            quickSort(array, startingIndex, partitioningIndex-1);
            quickSort(array, partitioningIndex +1, endingIndex);
        }
    }

    // A method to print the array of the size n
    private static void printArray(int array[])
    {
        int n = array.length;
        for (int i=0; i < n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }


    // Main function
    public static void main(String args[])
    {
        int array[] = {10, 8, 6, 4, 2, 0, 1, 3, 5, 7, 9,};
        int n = array.length;

        Quicksort qs = new Quicksort();
        qs.quickSort(array, 0, n-1);

        printArray(array);
    }
}