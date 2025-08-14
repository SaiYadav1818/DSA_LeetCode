class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        List<List<Integer>> ls=new ArrayList<>();
        boolean[] vis=new boolean[n+1];
        Arrays.fill(vis,false);
        for(int i=0;i<=n;i++){
            ls.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(isConnected[i][j]==1){
                ls.get(i).add(j);
                ls.get(j).add(i);
            }
        }
        }

        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                bfs(vis,isConnected,ls,i);
                count++;
            }
        }
        return count;
    }
    public static void bfs(boolean vis[],int[][] input,List<List<Integer>> ls,int i){
        vis[i]=true;
        Queue<Integer> que=new LinkedList<>();
       que.add(i);
       while(que.size()!=0){
        int node=que.poll();
        for(int nei:ls.get(node)){
            if(!vis[nei]){
                vis[nei]=true;
                que.add(nei);
            }
        }
       }
    }
}