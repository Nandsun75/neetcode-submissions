class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length; 

        int[] prefix = new int[n];
        prefix[1] = nums[0];
        prefix[0] = 1;

        int[] sufix = new int[n];
        sufix[n-1] = 1;
        sufix[n-2] = nums[n-1];
        
        for(int i = 2, j = n-3; i< n; i++,j--){
            prefix[i] = prefix[i-1]*nums[i-1];
            sufix[j] = sufix[j+1]*nums[j+1];
        }

        int[] ans = new int[n];
        ans[0] = sufix[0];
        ans[n-1] = prefix[n-1];
        for(int k = 1; k< n - 1; k++){
            ans[k] = prefix[k]*sufix[k];

        }

        return ans;
        
    }
}  
