class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') {
                continue;
            } else {
                rev += s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder(rev);
        for (int i = 0; i < s.length(); i++) {
            if (sb.toString().equals(sb.reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}