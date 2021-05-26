package DynamicProgramming;

public class Knapsack {
    public static void main(String[] args) {
        int[] v = { 20 , 5 ,10 , 40 ,15 ,25 };
        int[] w = { 1 ,2 ,3 ,8 , 7 ,4};
        int W = 10;
        knapsack( 1 , v , w , v.length -1 , W);
    }

    public static int knapsack(int depth  , int[] v, int[] w, int n, int W ){
        if(W < 0) {
            System.out.println("On W < 0 " + depth);
            return Integer.MIN_VALUE;
        }

        if(n < 0 || W == 0) return 0;
        System.out.println("depth =" + depth + " " + "W =  " + W + " " + " UP INCLUDE index: " + n);
        int include = v[n] + knapsack(depth + 1 , v,w,n-1, W - w[n]);
        System.out.println("depth =" + depth + " " + "W =  " + W + " " + "include= " + include);

        System.out.println("depth =" + depth + " " + "W =  " + W + " " + " UP EXCLUDE index: " + n);
        int exclude = knapsack( depth + 1 ,v , w , n -1 ,W);
        System.out.println("depth =" + depth + " " + "W =  " + W + " " + "exclude = " + exclude);


        System.out.println( "depth = "  + depth + " " + Integer.max(include , exclude));
        return Integer.max(include , exclude);


    }
}
