class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> ls=new ArrayList<>();
        int[] dis=new int[n+1];
        int min=0;
        for(int i=0;i<=n;i++){
            ls.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            ls.get(times[i][0]).add(new int[]{times[i][1],times[i][2]});
        }
        for(int i=1;i<=n;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dijkrasAlg(dis,ls,k);
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE){
                return -1;
            }
            min=Math.max(dis[i],min);
        }
        
       return  min;

    }
    public static void dijkrasAlg(int[] dis,List<List<int[]>> ls,int s){
        dis[s]=0;
        PriorityQueue<int[]> mh=new PriorityQueue<>((a,b)->(
            Integer.compare(a[0],b[0])
        ));
            mh.offer(new int[]{0,s});
       while(mh.size()!=0){
        int[] node=mh.poll();
        int value=node[0];
        int u=node[1];
        if(value>dis[u]){
            continue;
        }
        for(int[] neig:ls.get(u)){
            int edg=neig[1];
            int adjNode=neig[0];
            int new_data=edg+value;
            if(dis[adjNode]>new_data){
                dis[adjNode]=new_data;
                mh.offer(new int[]{new_data,adjNode});
            }
        }
       }
    }
}