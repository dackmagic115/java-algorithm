package search;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[100];
        Random rd = new Random();
        int key = 50;

        long reference= System.nanoTime();
        boolean result = binarySearch(array, key, array.length);
        long finish = System.nanoTime();

        System.out.println("result = " + result);
        System.out.println( ( (double)(finish-reference) )/1000000000.0);  //in seconds


    }

    public static boolean binarySearch(int[] array, int key, int n ){
        int first = 0;
        int last = n - 1;
        int mid = (first + last)/2;
        while ((first <= last) && (mid != n)){

            if(key == array[mid]){
                return true;
            }else if(key < array[mid]) {
                last = mid - 1;

            }else {
                 first = mid + 1;
                 mid = (first + last)/2;
            }
        }

        return  false;
    }
}
