
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        int size = str.length();
        if (size == 0) return false;
        if (size < 3) return true;
        for (int i = 0; i < size/2; i++) {
            char first = str.charAt(i);
            char last = str.charAt(size - 1);
            size--;
            if (first != last)
                return false;
        }
        return true;
    }
}
