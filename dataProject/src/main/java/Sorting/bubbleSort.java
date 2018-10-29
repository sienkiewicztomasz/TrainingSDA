package Sorting;

import java.util.Arrays;

public class bubbleSort {

    int [] numbers = {4,3,2,1,5};

    public static void main(String[] args) {
        int [] numbers = {4,3,2,1,5};
        sort(numbers);
        print(numbers);

    }

    public static void print (int[] numbers) {

        System.out.println(Arrays.toString(numbers));

    }
    public static void sort (int[] numbers) {

        for (int j=0; j<numbers.length; j++) {
            for (int i=0 ; i<numbers.length -1; i++ ) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i+1] = temp;
                }
            }
        }
    }
}
