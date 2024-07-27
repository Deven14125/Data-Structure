// A word is considered valid if:

// It contains a minimum of 3 characters.
// It contains only digits (0-9), and English letters (uppercase and lowercase).
// It includes at least one vowel.
// It includes at least one consonant.
// You are given a string word.

// Return true if word is valid, otherwise, return false.

// Notes:

// 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
// A consonant is an English letter that is not a vowel.

class Solution {
    public boolean isValid(String word) {
        return word.matches("(?i)(?=^.*[b-df-hj-np-tv-z])(?=.*[aieou])^[a-z0-9]{3,}$");
    }
}