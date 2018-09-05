import java.util.*;

public class CheckPermutation {
    /**
     * Checks to see if two strings are permutations of one another
     * @param a first string
     * @param b second string
     * @return whether both strings are permutations of each other
     * @runtime O(nlongn)
     */
    public boolean isPermutation(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        return Arrays.equals(aArr,bArr);
    }

    /**
     * Checks to see if two strings are permutations of one another
     * @param a first string
     * @param b second string
     * @return whether both strings are permutations of each other
     * @runtime O(n)
     */
    public boolean isPermutation2(String a, String b){
        int[] charArr = new int[128];
        char[] aArr = a.toCharArray();

        if(a.length() != b.length()){
            return false;
        }
        for(char c : aArr){
            charArr[c]++;
        }
        for(int i = 0; i < b.length(); i++){
            char c = b.charAt(i);
            charArr[c]--;
            if(charArr[c] < 0){
                return false;
            }
        }

        return true;
    }
}
