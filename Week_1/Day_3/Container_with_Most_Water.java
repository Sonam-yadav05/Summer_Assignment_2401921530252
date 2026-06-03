package Week_1.Day_3;

public class Container_with_Most_Water {
    public int maxArea(int[] height) {
        int n=height.length;
        int len=n-1;
        int areaMax=0;
        int i=0,j=n-1;
        while(i<=j){
            if(height[i]<height[j]){
                if(areaMax<(height[i]*len)){
                    areaMax=height[i]*len;
                
                }
                i++;
                len--;
            }
            else{
                if(areaMax<(height[j]*len)){
                    areaMax=height[j]*len;
                }
                j--;
                len--;
            }
        }
        return areaMax;
        
    }
    
}
