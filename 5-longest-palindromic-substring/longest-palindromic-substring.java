class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int l = 0;
        String result = "";
        for (int position = 0; position < s.length(); position++) {
            for (int i = position; i < s.length(); i++) {
                if (isReverseString(s.substring(position, i + 1)) && l < i - position + 1) {
                    result = s.substring(position, i + 1);
                    l = i - position + 1;
                }
            }
        }
        return result;
    }

    private static boolean isReverseString(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}