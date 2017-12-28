// HeapSort

public class HeapSort {
    
    private int parent(int i){
        return i/2;
    }
    
    private int leftChild (int i){
        return (2 * i) + 1;
    }
    
    private int rightChild (int i){
        return (2 * i) + 2;
    }
    
    private void swap(int[] heap, int iSmallest, int iLargest){
        int temp;
        temp = heap[iSmallest];
        heap[iSmallest] = heap[iLargest];
        heap[iLargest] = temp;
    }
    
    private void buildMaxHeap(int[] heap){
        int n = heap.length;
        
        for (int i = n/2 - 1; i >= 0; i--){
            maxHeapify(heap, n, i);
        }
    }
    
    private void maxHeapify(int[] heap, int n, int i){
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;
        
        if (left < n && heap[left] > heap[largest]){
            largest = left;
        }
        if(right < n && heap[right] > heap[largest]){
            largest = right;
        }
        if (largest != i){
            swap(heap, i, largest);
            maxHeapify(heap, n, largest);
        }
    }
    
    
    private void heapSort(int[] heap){
        int n = heap.length;
        
        buildMaxHeap(heap);
        
        for (int i=n-1; i>=0; i--){
            swap(heap, 0, i);
            maxHeapify(heap, i, 0);
        }
    }
    
    private void printHeap(int[] heap){
        int n = heap.length;
        for (int i=0; i<n; i++){
            System.out.print(heap[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] heap1 = {12, 11, 13, 5, 6, 7};
        int n1 = heap1.length;
        int[] heap2 = {22, 87, 63, 42, 90, 1};
        int n2 = heap2.length;
        int[] heap3 = {92, 33, 52, 9, 8, 25, 6, 67, 89, 20};
        int n3 = heap3.length;
        
        HeapSort h1 = new HeapSort();
        HeapSort h2 = new HeapSort();
        HeapSort h3 = new HeapSort();
        
        System.out.println("Heap 1");
        System.out.print("Before: ");
        h1.printHeap(heap1);
        
        h1.heapSort(heap1);
        System.out.print("\nAfter: ");
        h1.printHeap(heap1);
        
        System.out.println("\n\nHeap 2");
        System.out.print("Before: ");
        h2.printHeap(heap2);
        
        h2.heapSort(heap2);
        System.out.print("\nAfter: ");
        h2.printHeap(heap2);
        
        System.out.println("\n\nHeap 3");
        System.out.print("Before: ");
        h3.printHeap(heap3);
        
        h3.heapSort(heap3);
        System.out.print("\nAfter: ");
        h3.printHeap(heap3);
    }
}
