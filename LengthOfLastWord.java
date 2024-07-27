class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int size = -1;
        int i;
        if (s.length() == 1)
            return 1;
        for (i = s.length() - 1; i >= 0; i--) {
            char next = s.charAt(i);
            if (next == ' ') {
                size = i;
                break;
            }
        }
        if (size == -1)
            return s.length();
        s = s.substring(size, s.length() - 1);
        return s.length();
    }
}