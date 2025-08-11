class Solution {
    public int findLucky(int[] arr) {
        int[] count=new int[501];
        int  max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==count[arr[i]] ){
              max=  Math.max(max,arr[i]);
            }
        }
      return  max==Integer.MIN_VALUE ? -1 :max;
    }
}