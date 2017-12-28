// Dynamic Programming: Longest Increasing Subsequence

public class Proj6 {

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int len = arr.length;
        int max = 1;
        System.out.println("Length of LIS: " + lis(arr, len, max));
    }
    
    public static int lis(int[] arr, int len, int max){
        if (len == 1){
            return 1;
        }
        
        int temp;
        int subseqCount = 1;
        
        for (int i = 1; i < len; i++) {
            temp = lis(arr, i, max);
            if (arr[i-1] < arr[len-1] && temp + 1 > subseqCount){
                subseqCount = temp + 1;
            }
        }
        
        if (subseqCount > max){
            max = subseqCount;
        }
        
        return max;
    }    
}
