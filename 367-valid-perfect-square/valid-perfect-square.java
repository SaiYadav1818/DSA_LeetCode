class Solution {
    public boolean isPerfectSquare(int num) {
        int low=0;
        int high=num;
        int target=num;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)(mid*mid)==target){
                return true;
            }
            else if((long)mid*mid<target){
               low=mid+1;
            System.out.println(high);
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}