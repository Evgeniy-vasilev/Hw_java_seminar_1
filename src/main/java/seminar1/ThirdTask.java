class Solution {
    public String reverseWords(String s) {
        String result = "";
        int end = s.length() - 1;

        while (end > 0) {
            while (s.charAt(end) == ' ' && end > 0) end--;
            if (end == 0) break;

            int start = end - 1;

            while (start > 0 && s.charAt(start) != ' ') start--;

            String sub = s.substring(start, end + 1);
            sub = sub.trim();
            result += ' ' + sub;
            end = start - 1;
        }
        if (end == 0 && s.charAt(end) != ' ') result += ' ' + s.substring(0, 1);
        return result.trim();
    }
}
