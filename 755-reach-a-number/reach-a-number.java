class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int start=0;
        int count=1;
        while(start<=target){
            start+=count;
            count++;
        }
        if(start-count+1==target){
            return count-2;
        }
        if((start-target)%2==0){
            return count-1;
        }
        else{
            while((start-target)%2!=0){
                start+=count;
                count++;
            }
        }
        return count-1;
    }
}