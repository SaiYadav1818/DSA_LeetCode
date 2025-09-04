class Solution {
    class Trie{
       String word=null;
       Trie[] child=new Trie[26];
    }
    public String longestWord(String[] words) {
        Trie root=new Trie();
    for(String str:words){
        Trie node=root;
        for(char c:str.toCharArray()){
         int index=c-'a';
         if(node.child[index]==null){
             node.child[index]=new Trie();
         }
         node=node.child[index];
        }
        node.word=str;
    }
    String ans="";
    Queue<Trie> queue=new LinkedList<>();
    queue.add(root);
    while(queue.size()!=0){
        Trie node=queue.poll();
        for(int i=25;i>=0;i--){
            Trie children=node.child[i];
            if(children!=null && children.word!=null){
                queue.add(children);
                if(children.word.length()>ans.length() || (children.word.length()==ans.length() && children.word.compareTo(ans)<0)){
                    ans=children.word;
                }
            }
        }
    }
    return ans;
    }
    

}