import java.util.Arrays;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        int n = nums.length;
        for(int i = 0 ;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                cnt=1;
                break;
            }
        }
        if(cnt==0){
            return false;
        }
        else{
            return true;
        }
        
    }
}
    

