/*class Solution {
    public boolean checkPerfectNumber(int num) {
        int y= num;
        for (int i = 1; i < num; i++) {
            if ( num % i == 0) {
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
        // Numbers <= 1 cannot be perfect numbers
        if (num <= 1) return false;

        int sum = 1; // 1 is always a proper divisor

        // Loop up to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i; // Add the smaller factor
                if (i * i != num) {
                    sum += num / i; // Add the matching larger factor
                }
            }
        }

        return sum == num;
    }
}
