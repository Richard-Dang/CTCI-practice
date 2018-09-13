public class StringRotation {
    /**
     * Checks if two strings are rotated
     * @param s1 first input string
     * @param s2 second input string
     * @return whether second string is a rotated version of the first string
     * @runtime O(n)
     */
    public boolean isStringRotation(String s1, String s2){
        if(s1.equals(s2) || s1.length() != s2.length()){
            return false;
        }

        return s1.concat(s1).contains(s2);
    }

    /**
     * Checks if two strings are rotated
     * @param s1 first input string
     * @param s2 second input string
     * @return whether second string is a rotated version of the first string
     * @runtime O(n)
     */
    public boolean isStringRotation2(String s1, String s2){
        int rotationPoint = 0;
        for(int i = 0; i < s1.length(); i++){
            if(!s2.contains(s1.substring(0,i+1))){
                rotationPoint = i;
                break;
            }
        }
        String compareString = s1.substring(rotationPoint, s1.length()) + s1.substring(0, rotationPoint);
        return s2.equals(compareString);
    }
}
