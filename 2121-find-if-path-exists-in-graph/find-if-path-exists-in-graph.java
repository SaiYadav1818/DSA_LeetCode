class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> ls=new ArrayList<>();
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            ls.get(u).add(v);
            ls.get(v).add(u);
        }
        boolean[] b=new boolean[n];
        Arrays.fill(b,false);
        que.add(source);
        b[source]=true;
        while(que.size()!=0){
            int curr=que.poll();
            for(int nei:ls.get(curr)){
                if(!b[nei]){
                    que.add(nei);
                    b[nei]=true;
                }
                if(b[destination]){
                    return true;
                }
            }
            if(b[destination]){
                    return true;
                }

        }
return b[destination];
    }
}