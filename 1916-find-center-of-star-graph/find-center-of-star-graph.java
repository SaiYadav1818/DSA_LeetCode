class Solution {
    public int findCenter(int[][] edges) {
        int max=0;
        
        for(int i=0;i<edges.length;i++){
          max= Math.max(Math.max(max,edges[i][0]),edges[i][1]);
        }
        int[] degree=new int[max+1];
        for(int i=0;i<edges.length;i++){
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;
        }
        for(int i=0;i<=max;i++){
            if(degree[i]==max-1){
                return i;
            }
        }
        return max-1;
    }
}