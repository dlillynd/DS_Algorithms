//import java.util.ArrayList;

public class Correlation {

    static double k_val = 1.0/9.0;
    static int k_row = 3;
    static int k_col = 3;
    static int m_row = 4;
    static int m_col = 6;
    static double[][] kernel = new double[][] {
        {-2,0,1},
        {-1,0,1},
        {-1,0,2}
    };
    static int[][] matrix = new int[][] {
        {4, 6, 9, 6, 4, 6}, 
        {9, 6, 4, 9, 9, 9},
        {9, 6, 2, 2, 9, 2},
        {10, 10, 10, 10, 10, 10}
    };


    private static double[][] correlation(int[][] matrix, double k_val, int k_row, int k_col) {
        double[][] answer = new double[m_row-2][m_col-2];

        for (int x=0; x<answer.length; x++) {
            for (int y=0; y<answer[0].length; y++)
            {
                double i_sum = 0;
                double o_sum = 0;
                for (int i=0; i<k_row; i++) {
                    for (int j=0; j<k_col; j++) {
                        i_sum = i_sum + matrix[i+x][j+y]*(kernel[i][j]);
                    }
                    System.out.println();
                    o_sum = o_sum + i_sum;
                    
                    i_sum = 0;
                }
                
                answer[x][y] = o_sum;

            }
        }
        

        printMatrix(answer);
        return answer;
    }

    public static void printMatrix(double[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        System.out.println("Correlation Output");
        correlation(matrix, k_val, k_row, k_col);
        //Output is:
        //-9.0 -5.0 7.0 -4.0 
        //-11.0 3.0 18.0 1.0 

    }
}