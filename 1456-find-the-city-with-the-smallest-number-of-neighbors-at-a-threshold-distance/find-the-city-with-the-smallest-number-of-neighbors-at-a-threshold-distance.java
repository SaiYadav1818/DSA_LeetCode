class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
       List<List<int[]>> list=new ArrayList<>();
       int min=Integer.MAX_VALUE;
       int city=0;
       for(int i=0;i<n;i++){
        list.add(new ArrayList<>());
       }
       for(int i=0;i<edges.length;i++){
        list.get(edges[i][0]).add(new int[]{edges[i][1],edges[i][2]});
        list.get(edges[i][1]).add(new int[]{edges[i][0],edges[i][2]});
       } 
       for(int i=0;i<n;i++){
       int count= dijkras(n,i,list,distanceThreshold);
       if(count<=min){
        min=count;
        city=i;
       }
       }
       return city;
       
    }
    public static int dijkras(int n,int s,List<List<int[]>> list,int dt){
        PriorityQueue<int[]> hm=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        int[] dis=new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[s]=0;
        hm.add(new int[]{0,s});
        while(hm.size()!=0){
            int[] node=hm.poll();
            int wei=node[0];
            int u=node[1];
            if(dis[u]<wei){
                continue;
            }
            for(int[] nei:list.get(u)){
                int v=nei[0];
                int w=nei[1];
                int new_dis=w+wei;
                if(dis[v]>new_dis){
                    dis[v]=new_dis;
                   hm.add(new int[]{new_dis,v});
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(dis[i]<=dt){
                count++;
            }
        }
        return count;

    }
}