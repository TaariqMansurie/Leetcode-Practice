package sorting;

public class bubbleSort {
    public static void bubbleSort(int arr[]){
        for (int turn = 0; turn< arr.length - 1; turn ++){
            for ( int j = 0; j < arr.length -1 - turn; j++){
                if (arr [j] > arr [j+1]){
                    //swap
                    int temp = arr[j];
                    arr [j] = arr[j+1];
                    arr [j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for ( int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
    
}


//dry run

// Initial array: {5, 4, 1, 3, 2}


// First Iteration (i = 0)

// j = 0: Compare 5 and 4. Swap, since 5 > 4.
// Array: {4, 5, 1, 3, 2}
// j = 1: Compare 5 and 1. Swap, since 5 > 1.
// Array: {4, 1, 5, 3, 2}
// j = 2: Compare 5 and 3. Swap, since 5 > 3.
// Array: {4, 1, 3, 5, 2}
// j = 3: Compare 5 and 2. Swap, since 5 > 2.
// Array: {4, 1, 3, 2, 5}
// After the first iteration, the largest element 5 has "bubbled up" to its correct position.


// Second Iteration (i = 1)
// j = 0: Compare 4 and 1. Swap, since 4 > 1.
// Array: {1, 4, 3, 2, 5}
// j = 1: Compare 4 and 3. Swap, since 4 > 3.
// Array: {1, 3, 4, 2, 5}
// j = 2: Compare 4 and 2. Swap, since 4 > 2.
// Array: {1, 3, 2, 4, 5}


// Third Iteration (i = 2)

// j = 0: Compare 1 and 3. No swap needed, since 1 < 3.
// Array: {1, 3, 2, 4, 5}
// j = 1: Compare 3 and 2. Swap, since 3 > 2.
// Array: {1, 2, 3, 4, 5}


// Fourth Iteration (i = 3)

// j = 0: Compare 1 and 2. No swap needed, since 1 < 2.
// Array: {1, 2, 3, 4, 5}
// The array is now sorted, and the final output will be {1, 2, 3, 4, 5}.

// Output
// The Print_Arr function will print the sorted array: 1 2 3 4 5.

// printArr we are just traversing the array
// then we we reach each element we print it
// there is nothing complex


// The outer loop (for(int turn=0; turn<arr.length-1; turn++)) runs n-1 times, where n is the length of the array. This is because in each iteration of this loop, the largest element is bubbled to the correct position (end of the array).

// The inner loop (for(int j=0; j<arr.length-1-turn; j++)) is where the actual comparison and swapping happens. It iterates over the array from the beginning to the n-turn-1 index. The turn variable represents the number of elements that have already been sorted (bubbled to the end) and thus can be skipped in the subsequent iterations


// * The outer loop (for(int turn=0; turn<arr.length-1; turn++)) runs n-1 times, where n is the length of the array. This is because in each iteration of this loop, the largest element is bubbled to the correct position (end of the array).
// * The inner loop (for(int j=0; j<arr.length-1-turn; j++)) is where the actual comparison and swapping happens. It iterates over the array from the beginning to the n-turn-1 index.
// * In each iteration of the inner loop, it checks if the current element (arr[j]) is greater than the next element (arr[j+1]). If it is, it swaps them. This is how the larger elements gradually move (or bubble) towards the end of the array.