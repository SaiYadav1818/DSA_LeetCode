class Solution {
    public int findDuplicate(int[] nums) {
        int num2=0;
       Map<Integer,Integer> map=new HashMap<>();
       for(int num:nums)
       {
        map.put(num,map.getOrDefault(num,0)+1);
       } 
       for(var entry:map.entrySet())
       {
if(entry.getValue()>1)
{
    num2=entry.getKey();
    break;
}
       }
       return num2;
    }
}