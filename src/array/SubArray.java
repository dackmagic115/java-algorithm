package array;

public class SubArray {
    public static void main(String[] args) {
        int[] nums = { 10,5,2,6 };
        int k = 100;
        int[] nums2 = { 10, 4, 2, 5, 6, 3, 8, 1 };
        int k2 = 3;

//        ProductLessThanK(nums,k);
        MinimumSubArray(nums2,k2);
    }


    // SliceWindows
    public static void ProductLessThanK(int[] nums, int k) {
            int result = 0;
            int prod = 1;

            for(int left = 0, right = 0; right < nums.length; right++){
                prod *= nums[right];

                while (prod >= k){
                    prod /= nums[left];
                    left++;
                }

                result += right - left + 1;

                // round: 1 { 10 } prod 10 right 0 left 0 1 result 1
                // round: 2 { 10 , 5 } prod 50 right 1 left 0 result 3
                // round: 3 { 10 , 5 , 2 } prod 100 right 2 left 0 result 6
            }

        System.out.println("output : " +  result);
    }

    public static void MinimumSubArray(int[] nums, int k){
        int minimum = Integer.MAX_VALUE;
        int sum = 0;
        int last = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(i+1 >= k){
                if(sum < minimum){
                    minimum = sum;
                    last = i;
                }

                sum -= nums[i + 1 - k];
            }
        }
        int start = last - k + 1;
        System.out.println("(" + start + "," + last + ")");

    }
}
