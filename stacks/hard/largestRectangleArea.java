package stacks.hard;

public class largestRectangleArea {
    package stacks;
import java.util.*;

public class maxAreaOfHistogram {
    
    public static void maxArea(int arr[]){ // O(N) - optimized
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller right - O(n)
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                // -1 
                nsr[i] = arr.length;
            } else {
                // top
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left - O(n)
        s = new Stack<>(); // emptyinng the stack

        for(int i=0; i< arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                // -1 
                nsl[i] = -1;
            } else {
                // top
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area : width =  j - i -1 = nsr[i]-nsl[i] - 1; - O(n)
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width ;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max area in histogram  = "+maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; // heights in histogram
        maxArea(arr);
    }
}

}
