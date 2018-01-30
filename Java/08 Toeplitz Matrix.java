/*
判断一个矩阵是否满足条件：每一个对角线上的元素都相等。

==>即判断每一个元素是否与其右下角的元素相等。(存在的情况下)S

*/

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length-1;i++)
        {
            for(int j=0;j<matrix[0].length-1;j++)
            {
                if(matrix[i][j]!=matrix[i+1][j+1])
                    return false;
            }
        }
        return true;
    }
}