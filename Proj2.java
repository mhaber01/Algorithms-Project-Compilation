// Maximum Subarray

/*

The maxSubArray() method below implements a for loop that goes through each element of an array, adds the current max sum to that element, and sets it to the new max only if it is greater than the original max. The program is finding the subarray within the array that has the largest sum.

Since a for loop that takes n time holds an if else statement that takes constant c time, I was able to find the max subarray in O(n) time: T(n)=O(n).

*/

public class Proj2 {

    public static void main(String[] args) {
        int[] A = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = A.length;
        int max_sum;
        System.out.println("Maximum Subarray: " + maxSubArray(A, n));
    }
    
    public static int maxSubArray(int A[], int n){
        int max = 0;
        int maxEnd =0;
        
        for (int i = 0; i < n; i++){
            maxEnd += A[i];
            if (maxEnd < 0){
                maxEnd = 0;
            }
            else if (max < maxEnd){
                max = maxEnd;
            }
        }
        
        return max;
    }
    
}
