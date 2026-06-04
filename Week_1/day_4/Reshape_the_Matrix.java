package Week_1.day_4;

public class Reshape_the_Matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if(rows*cols != r*c){
            return mat;
        }
        int[][] ans = new int[r][c];
        int m=0,n=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ans[m][n] = mat[i][j];
                n++;

                if(n==c){
                    n=0;
                    m++;
                }
            }
        }
        return ans;
        
    }
    
}
