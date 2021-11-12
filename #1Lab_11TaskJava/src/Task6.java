public class Task6 {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int t = 2;
        int [][] matrix1 = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix1[i][j] = n * i + j;
                System.out.print(" " + matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int [][] matrix2 = new int[n][t];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < t; j++)
            {
                matrix2[i][j] = n * i + j;
                System.out.print(" " + matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int [][] matrix3 = new int[m][t];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < t; j++)
            {
                matrix3[i][j] = 0;
                for (int k = 0; k < n; k++)
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                System.out.print(" " + matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }

}