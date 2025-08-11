class Solution {
    public boolean reorderedPowerOf2(int n) {
       String str= sort(n);
       for(int i=0;i<31;i++){
        String check=sort(1<<i);
        if(check.equals(str)){
            return true;
        }
       }
       return false;
    }
    public static String sort(int num){
       char[] c= String.valueOf(num).toCharArray();
       Arrays.sort(c);
     return   new String(c);
    }
}