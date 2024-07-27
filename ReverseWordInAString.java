// class Solution {
//     public String reverseWords(String s) {
//         s = s.trim();
//         String reverse = "";
//         for (int i = s.length() - 1; i >= 0; i--) {
//             char next = s.charAt(i);
//             if (next==' ') {
//                 for (int j = next; i < next - 1; i++) {

//                     reverse += next;
//                 }
//             }
//         }
//         return reverse;
//     }
// }

class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String reverse = "";

        for (int i = str.length - 1; i > 0; i--) {
            reverse += str[i] + " ";
        }
    return reverse + str[0];
    }
}