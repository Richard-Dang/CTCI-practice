public class StringCompression {
    /**
     * Compresses a string
     * @param str input string
     * @return compressed version of original string if it is shorter than original string
     * @runtime O(n)
     */
    public String strCompression(String str){
        char[] charStr = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        int currentCount = 0;

        for(int i = 0; i < str.length(); i++){
            currentCount++;
            if( i + 1 >= str.length() || charStr[i] != charStr[i+1]){
                newStr.append(charStr[i]);
                newStr.append(currentCount);
                currentCount = 0;
            }
        }
        return newStr.length() > str.length() ? str : newStr.toString();
    }
}
