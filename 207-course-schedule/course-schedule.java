class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         int n=numCourses;
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int[] res=new int[n];
        int j=0;
        int[] indegree=new int[n];
      for(int i=0;i<n;i++){
        ls.add(new ArrayList<>());
      }  
      for(int i=0;i<prerequisites.length;i++){
        ls.get(prerequisites[i][1]).add(prerequisites[i][0]);
        indegree[prerequisites[i][0]]++;
      }
      for(int i=0;i<n;i++){
        if(indegree[i]==0){
            list.add(i);
        }
      }
      
      for(int i=0;i<list.size();i++){
         for(int v:ls.get(list.get(i))){
            indegree[v]--;
            if(indegree[v]==0){
               list.add(v);
            }
         }
      }
      if(list.size()!=n){
    return false;
      }
     
      for(int i=0;i<list.size();i++){
        res[j++]=list.get(i);
      }
      
return true;
    }
}