package hashing.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class topKFrequentElements {
    // so size of k, we return the most frequent elements in an array
    // more the frequency, higher that number will be in the sorted order adn then from that array, k will be 
    // selected and printed.
    //first select a hashmap, put numbers in to the hashm,ap depending if its already present or not
    // then put it into an array list and also sortt it bnased on the frequency
    //.lastlyt selecting the result array of size k again and printing out those numbers from sorted array list to the result array
    public static int[] topKFrequentElementss (int nums[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        // ArrayList<Integer> list = new ArrayList<>(map.keySet());
        
        //using the hashmap first,
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                //if it already exists then we increase the count of it by getting its key in the map,
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }

        //using the array list to store and sort the keys by frequency
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b)- map.get(a));
        int result[] = new int[k];
        int index=0;

        //now the top element which was sorted based on the frequency wil be inerted first in the rresult array
        // and it will keep going on until
        for(int i=0; i<k; i++){
            result[index] = list.get(i);
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        String output = Arrays.toString(topKFrequentElementss(nums, k));
        System.out.println(output);

    }
}
