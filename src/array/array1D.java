package array;


public class array1D {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int start = 1;
        int end = 10;
        int result = 0;
        for(int i = start; i < end; i++){
            System.out.println(i);
            numbers[i] = i;
        }

        for(int i = 0; i < numbers.length; i++){
            result += numbers[i];
        }

        System.out.println("result = " + result);
    }


}
