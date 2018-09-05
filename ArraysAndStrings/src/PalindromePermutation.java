public class PalindromePermutation {

    /**
     * Determines if a string is a palindrome permutation
     * @param str input string
     * @return whether string is a palindrome permutation
     * @runtime O(n)
     */
    public boolean isPalindromePermutation(String str){
        str = str.toLowerCase().replace(" ", "");
        char[] charStr = str.toCharArray();
        int[] charCount = new int[128];
        boolean foundOdd = false;

        for(char c : charStr){
            charCount[c]++;
        }
        for (int i : charCount){
            if(i%2 == 1) {
                if(foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
}
