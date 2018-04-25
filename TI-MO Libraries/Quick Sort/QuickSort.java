package QuickSort;

//import jdk.management.resource.internal.ResourceNatives;

//mainly used for toStrings and to display efficient line of code.
import java.util.Arrays;

//used for finding hte random point of the pivot index number.
import java.util.Random;

public class QuickSort {

    //We're passing in the array itself, we're passing in the first and the last index of the array.
    public void quickSort(int[] Array){
        quickSort(Array, 0 , Array.length - 1);
    }

    //making a new wall to split between two arrays.
    private void quickSort(int [] Array, int low, int high){
        //if more than one item left to sort in that range
        if(low < high + 1){
            int w = wall (Array, low, high);
            //Left part of the wall:
            quickSort(Array, low, w-1);
            //Right side of the wall:
            quickSort(Array, w+1, high);
        }
    }

    //swaps two numbers in the array
    private void swapNumbers(int [] Array, int idx1, int idx2){
        int temp = Array[idx1];
        Array[idx1] = Array[idx2];
        Array[idx2] = temp;
    }

    //gets a random pivot by selecting number between low and high and returns it.
    private int pivot(int low, int high){
        Random random = new Random();
        return random.nextInt((high - low) + 1 ) + low;
    }


    //moves all the numbers that are smaller to the pivot(left).
    //moves all the numbers that are bigger to the pivot(right).
    //returns the pivot index.
    private int wall(int [] Array, int low, int high){
        //swaps items to the left of the pivot
        swapNumbers(Array, low, pivot(low,high));
        //is positioned just to the right of the pivot
        int border = low + 1;
        //comparison through each item through iteration in for loop.
        for(int i = border; i <= high; i ++){
            //if the array index is lower than that the array low then we swap it with the border.
            if(Array[i] < Array[low]){
                swapNumbers(Array, i ,border++);
            }
        }
        //then swap the pivot value with the border and adjust it to its proper position.
        swapNumbers(Array, low, border-1);
        //return the index of the pivot value.
        return border - 1;
    }

    //test main method
    public static void main(String [] args){
        //making a quick sort object called quickSort(this is separate to the methods which are private).
        QuickSort qs = new QuickSort();
        //simple array list with some duplicates as well:
        int[] Array = {9,7,5,4,7,3,8,57,90,5,3,6};
        //printed the array before it is sorted:
        System.out.println("Before it's sorted:");
        System.out.println(Arrays.toString(Array));
        //quickSort object calling the method quickSort to sort the array which is inside the parameter.
        qs.quickSort(Array);
        //printed array after it has been sorted:
        System.out.println("After it's sorted:");
        System.out.println(Arrays.toString(Array));


    }
}
