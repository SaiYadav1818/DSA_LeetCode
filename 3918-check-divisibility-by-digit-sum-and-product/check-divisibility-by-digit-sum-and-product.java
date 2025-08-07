class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int n1=n;
        int p=1;
        while(n>0){
            sum+=n%10;
            p*=n%10;
            n/=10;
        }
        int r=sum+p;
        if(n1%r==0){
            return true;
        }
        return false;

    }
}