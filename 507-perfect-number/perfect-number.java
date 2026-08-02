/*class Solution {
    public boolean checkPerfectNumber(int num) {
        int y= num;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                y-=i;
            }

        }
        if (y == 0)
            return true;
        else
            return false;
    }
}*/
class Solution {
    public boolean checkPerfectNumber(int num) {
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }
}