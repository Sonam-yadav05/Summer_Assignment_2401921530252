package Week_1.day_4;

public class Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
        
    }
    
}
