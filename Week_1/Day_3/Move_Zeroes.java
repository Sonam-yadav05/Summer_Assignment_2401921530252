package Week_1.Day_3;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nzeros=0;
        for(int i =0;i<n;i++){
            if(nums[i]==0){
                nzeros++;
            }
        }
        int j=0;
        while(j<nzeros){
             for(int i=0;i<n-1;i++){
                if(nums[i]==0){
                    int temp=nums[i+1];
                    nums[i+1]=nums[i];
                    nums[i]=temp;
                }
            }
            j++;
        }
    }
    
}
