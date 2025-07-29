class Solution {
    public int orangesRotting(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int fresh=0;
       Queue<List<Integer>> queue=new LinkedList<>();
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1){
                fresh++;
            }
            else if(grid[i][j]==2){
                List<Integer> ls=new ArrayList<>();
                ls.add(i);
                ls.add(j);
                queue.add(ls);
            }
        }
      }
      int ans=0;
      int check=fresh;
      if(fresh==0){
        return 0;
      }
      int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
      while(!queue.isEmpty()){
        int size=queue.size();
        boolean minTime=false;
        for(int i=0;i<size;i++){
             List<Integer> list=queue.poll();
        int u=list.get(0);
        int v=list.get(1);
        for(int[] arr:dir){
            int newRow=arr[0]+u;
            int newCol=arr[1]+v;
if(newRow>=0 && newCol>=0 && newCol<m && newRow<n && grid[newRow][newCol]==1){
                fresh--;
                List<Integer> ls=new ArrayList<>();
                ls.add(newRow);
                ls.add(newCol);
                queue.add(ls);
                grid[newRow][newCol]=2;
                minTime=true;
            }
        }
        }
            if(minTime==true){
                ans++;
            }
        
      }
    if (fresh == 0) return ans;
return -1;
    }
}