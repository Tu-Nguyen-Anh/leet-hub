class Solution {
    public boolean isPalindrome(int x) {
        int reversedNumber = 0;
        int originalNumber = x;
        if(x <0){
            return false;
        }
            while(x!=0){
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
            }
        if(originalNumber == reversedNumber)
            return true;
        else
            return false;
    }
}
