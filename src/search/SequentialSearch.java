package search;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] array = IntStream.range(1,100).toArray();
        int key = 101;

        long reference= System.nanoTime();
        boolean search = sequentialSearch(array, key , array.length);
        long finish = System.nanoTime();

        System.out.println("result = " + search);
        System.out.println( ( (double)(finish-reference) )/1000000000.0);  //in seconds

    }

    public static boolean sequentialSearch(int[] array, int key, int n){
        for(int i = 0; i < n; i++){
            if(array[i] == key) {
                return  true;
            }
        }
        return  false;
    }
}
