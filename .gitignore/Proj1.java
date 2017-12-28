// Finding the "Peak Entry"

/* 

By using Divide & Conquer and basing my program off of the Binary Search algorithm, I was able to find the peak entry in O(logn) time. 

Starting from the middle element of an array, the program will compare it with the elements to its left and right. If the middle element is less than the element to its left, the findPeakEntry() method will recurse and find the peak element in the left half of the array. However, if the middle element is not less than either left or right element, then return its index. Otherwise, the middle element is less than the element to its right and the method will be called to find the peak element in the right half of the array.

Since each if statement takes constant time and holds a recursion call, a recursion tree for this method only has a single node with cost c at each level. Therefore, the height of the tree is the number of levels (logn) plus c: T(n) = O(logn).

*/

import java.util.Scanner;

public class Project1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of your array: ");
        int len = input.nextInt();
        
        int[] arr = new int[len];
        System.out.print("Enter " + len + " numbers to put in the array: ");
        for (int i = 0; i < len; i++){
            arr[i] = input.nextInt();
        }
        
        int low = 0;
        int high = len - 1;
        int answer = findPeakEntry(arr, low, high, len);
        
        System.out.println("Peak Entry: A[" + (answer+1) + "] = " + arr[answer]);
    }
    
    public static int findPeakEntry(int[] A, int low, int high, int n){
        int mid = (high + low)/2;
        
        if(mid > 0 && A[mid] < A[mid-1]){
            return findPeakEntry(A, low, (mid-1), n);
        }
        else if((mid == 0 || A[mid] >= A[mid-1]) && (mid == n-1 || A[mid] >= A[mid+1])){
            return mid;
        }
        else {
            return findPeakEntry(A, (mid+1), high, n);
        }
    }
}

