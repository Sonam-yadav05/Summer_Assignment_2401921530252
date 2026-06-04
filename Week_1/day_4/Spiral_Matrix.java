package Week_1.day_4;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int fr=0,fc=0,lr=m-1,lc=n-1;
        int count=0;
        List<Integer> ans= new ArrayList<>();
        while(count<=m*n){
            for(int i=fr;i<=lc;i++){
                ans.add(matrix[fr][i]);
                count++;
            }
            fr++;
            if(count==m*n) break;
            for(int i=fr;i<=lr;i++){
                ans.add(matrix[i][lc]);
                count++;
            }
            lc--;
            if(count==m*n) break;
            for(int i=lc;i>=fc;i--){
                ans.add(matrix[lr][i]);
                count++;
            }
            lr--;
            if(count==m*n) break;
            for(int i=lr;i>=fr;i--){
                ans.add(matrix[i][fc]);
                count++;
            }
            fc++;

        }
        return ans;
        
    }
    
}
