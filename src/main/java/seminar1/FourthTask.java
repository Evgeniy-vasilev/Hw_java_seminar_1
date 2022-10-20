class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();

        if (s.length() < 2) return true;

        while (start < end) {
            while (start < end && Character.isLetterOrDigit(s.charAt(start)) == false) start++;
            while (start < end && Character.isLetterOrDigit(s.charAt(end)) == false) end--;

            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else return false;
        }
        return true;
    }
}
