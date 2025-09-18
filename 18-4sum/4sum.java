class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
     Arrays.sort(nums);
     int n=nums.length;
     for(int i=0;i<n-3;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        for(int j=i+1;j<n-2;j++){
            if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
        int left=j+1;
        int right=n-1;
        while(left<right){
            int third=nums[left];
            int fourth=nums[right];
            long add=(long)nums[i]+nums[j]+third+fourth;
            if(add==target){
                List<Integer> ls=new ArrayList<>();
               ls.add(nums[i]);
               ls.add(nums[j]);
               ls.add(nums[left]);
               ls.add(nums[right]);
                ans.add(ls);
                while(left<right && nums[left]==nums[left+1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right-1]){
                    right--;
                }
                left++;
                right--;
            }
            else if(add<target){
                left++;
            }
            else{
                right--;
            }
        }
        }
     }   
     return ans;
    }
}