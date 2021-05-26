package array;

import java.util.Arrays;

public class array2D {
    public static void main(String[] args) {
        int[][] numbers =  new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int[] a : numbers){
            for(int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("2D Array");
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(numbers.length);
        int result = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                System.out.println("array["+i+","+j+"]= "+numbers[i][j]+"");
                result += numbers[i][j];
            }
        }

        System.out.println("result = " + result );


    }
}
