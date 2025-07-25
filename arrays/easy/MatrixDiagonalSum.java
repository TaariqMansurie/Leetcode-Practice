public class MatrixDiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        //for priomary diagnoal of the matrix from left top to right bottom
        //brute force solution - O(n^2)
        // for(int i=0; i<matrix.length; i++){
        //     for (int j=0;j<matrix[0].length; j++){
        //         //checking for primary diagnoal
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         //checking for secondary diagonal;
        //         if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        //optimal approach with - O(n)

        for(int i=0; i<matrix.length;i++){
            //primary diagonal
            sum += matrix[i][i];
 
            //secondary diagonal
            if(i != matrix.length-1-i){ //since i + j = n-1, then j = n-1-i
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("The sum of primary and secondary diagnoals are : " +diagonalSum(matrix));
    }
}
