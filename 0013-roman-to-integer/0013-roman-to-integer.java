class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = romanMap.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int currentNum = romanMap.get(s.charAt(i));
            int nextNum = romanMap.get(s.charAt(i + 1));

            if (currentNum < nextNum) {
                result -= currentNum;
            } else {
                result += currentNum;
            }
        }

        return result;
    }
}