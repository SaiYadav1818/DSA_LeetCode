class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
      List<List<Integer>> ls=new ArrayList<>();
      Queue<Integer> que=new LinkedList<>();
      List<Set<Integer>> ans=new ArrayList<>();
      int[] indegree=new int[n];
      for(int i=0;i<n;i++){
        ls.add(new ArrayList<>());
       ans.add(new HashSet<>());
      }  
      for(int i=0;i<edges.length;i++){
        ls.get(edges[i][0]).add(edges[i][1]);
        indegree[edges[i][1]]++;
      }
      for(int i=0;i<n;i++){
        if(indegree[i]==0){
            que.add(i);
        }
      }
      while(que.size()!=0){
        int u=que.poll();
        for(int v:ls.get(u)){
            ans.get(v).add(u);
            ans.get(v).addAll(ans.get(u));
             indegree[v]--;  
                if (indegree[v] == 0) {
                    que.add(v);
                }
        }
      }
      List<List<Integer>> res=new ArrayList<>();
     for(Set<Integer> set:ans){
        List<Integer> sort=new ArrayList<>(set);
      Collections.sort(sort);
        res.add(sort);
     }
     
      return res;
    }
}