import java.util.*;

class Solution {
    public static long nCr(int n, int r){
        long result = 1;

        //calculating nCr
        for(int i=0; i<r ; i++){
            result = result * (n-i);
            result = result / (i+1);
        }
        return result;
    }   
    
    //1st question
    //in order to get the pascal triangle we neeed to do this step, in order to get the element at (row, column) position.
    public static int pascalTriangle(int r, int c){
        int element = (int)nCr(r-1, c-1);
        return element;
    }

    //2nd question
    //given the row number n, print the nth row of Pascal's triangle
    public static void rowPrinting(int n){
        int answer = 1 ;
        System.out.print(answer+ " ");  //printing 1st element which is always 1

        for (int i =1; i<n; i++){
            answer = answer * (n-i);
            answer = answer /  (i) ;
            System.out.print(answer+ " ");
        }
        System.out.println();
    } 

    //3rd question
    //print the entire pascal triangle
    public static void printPascalTriangle(int n){
        // for(int row = 1; )
    }


    public static void main(String[] args) {
        int r = 6;
        int c = 3;
        int n = 6;
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (" +r +"," +c +") " +"is :" +element);
        rowPrinting(n);
    }
    
}
