public class OneAway {
    /**
     * Checks if two strings are one (or zero) edits (remove, insert or replace single character) away
     * @param a first string
     * @param b second string
     * @return whether strings are one edit away
     * @runtime O(n)
     */
    public boolean isOneAway(String a, String b){
        int numNeg = 0;

        if(a.equals(b)) return true;
        if(Math.abs(a.length()-b.length())>1) return false;

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int[] charCount = new int[128];

        for(char c : aArr){
            charCount[c]++;
        }
        for(char c : bArr){
            charCount[c]--;
        }
        for(int i : charCount){
            if(i<0){
                numNeg++;
            }
        }
        return numNeg<=1;

    }
}
