package popular;
// Print 2D array in spiral order
public class Print2DArraySpiral {
    public static void main(String[] args) {
        Print2DArraySpiral obj = new Print2DArraySpiral();
        int matrix[][] =  {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                         {9, 10, 11, 12},
                        {13, 14, 15, 16},
                        {17, 18, 19, 20}};

        int matrix1[][] =  {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                          {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        obj.printSpiralOrder(matrix);

    }
    /*
    top      1    2     3
             4    5     6
    bottom   7    8     9
           left        right

     */
    public void printSpiralOrder(int[][] matrix){

        int top =0; int bottom = matrix.length -1;
        int left =0; int right = matrix[0].length -1;

        while (true){

            if (left > right){
                break;
            }
            // Print Right
            for(int i = left; i<=right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            if (top > bottom){
                break;
            }
            // Print down
            for (int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (left > right){
                break;
            }
            // Print left
            for (int i =right; i>= left; i--){
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;
            if (top > bottom){
                break;
            }
            //Print top
            for (int i=bottom; i>=top;i--){
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
    }
}
