class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                rev += s.charAt(i);
            }
        }

        StringBuilder sb = new StringBuilder(rev);

        if (sb.toString().equals(sb.reverse().toString())) {
            return true;
        } else
            return false;

    }
}