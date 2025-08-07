class Solution {
    public int maximum69Number (int num) {
        List<Integer> list=new ArrayList<>();
        while(num>0){
        list.add(num%10);
        num=num/10;
        }
        
        StringBuilder sb=new StringBuilder();
       for(int i=list.size()-1;i>=0;i--){
        if(list.get(i)==6){
            list.set(i,9);
            break;
        }
       }
        for(int i=list.size()-1;i>=0;i--){
            sb.append(list.get(i));
        }
        return Integer.parseInt((sb.toString()));
    }
}