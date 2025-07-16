package Java;
class Solution{
    public boolean hasDuplicate(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                    return true;       
            }
        }
        return false;

        

    }
}
class Duplicate_array{
public static void main(String args[]){ 
    int nums[]={1,2,3,4};
    Solution s=new Solution();
    System.out.println(s.hasDuplicate(nums));
}
}