class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n=groupSizes.length;
        List<List<Integer>> ls=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=groupSizes[i];
            if(!map.containsKey(num)){
                map.put(num,new ArrayList<>());
            }
           List<Integer> ans=map.get(num);
           ans.add(i);
            if(map.get(num).size()==num){
                ls.add(ans);
                map.remove(num);
            }
        }
       
        return ls;
    }
}