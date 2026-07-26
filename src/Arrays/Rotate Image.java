class Solution {
    public void rotate(int[][] matrix)
     {
        int n = matrix.length;
        //step 1: Transpose the matrix
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //step 2:Reverse each row
        for(int i = 0; i<n; i++)
        {
            int firstcol = 0;
            int lastcol = n-1;
            while(firstcol <= lastcol)
            {
                int temp = matrix[i][firstcol];
                matrix[i][firstcol] = matrix[i][lastcol];
                matrix[i][lastcol] = temp;
                firstcol++;
                lastcol--;
            }
        }
    }
}
