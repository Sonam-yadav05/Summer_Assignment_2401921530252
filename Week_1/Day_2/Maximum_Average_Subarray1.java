public class Maximum_Average_Subarray1 {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        int i=0,j=0;
        double sum=0;
        while(j<k){
            sum += nums[j];
            j++;
        }
        double max=sum;
        while(j<n){
            sum = sum - nums[i] + nums[j];
            max=Math.max(max,sum);
            i++;
            j++;
        }
        return max/k;
        
    }
    
}
