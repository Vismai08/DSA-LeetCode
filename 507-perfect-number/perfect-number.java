class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1)
        return false;
        int y= num-1;
        for (int i = 2; i*i<= num; i++) {
            if ( num % i == 0) {
                y-=i;
                if(i*i!=num){y=y-(num/i);}
            }

        }
        
            return y==0;
        
    }
}
