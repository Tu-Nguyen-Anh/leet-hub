class Solution {
    public static double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 1 / (x * myPow(x, -(n + 1)));
            } else {
                return 1 / myPow(x, -n);
            }
        } else if (n % 2 == 0) {
            double halfPow = myPow(x, n / 2);
            return halfPow * halfPow;
        } else {
            return x * myPow(x, n - 1);
        }
    }
}
