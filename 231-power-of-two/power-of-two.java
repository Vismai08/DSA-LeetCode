class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n <= 0) return false;
        long pow = 1; 
        while (pow < n) 
        {
            pow *= 2;
        }
        return pow == n;
    }
}