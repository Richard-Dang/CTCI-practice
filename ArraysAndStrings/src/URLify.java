public class URLify {
    /**
     * Urlifies a string (' ' replaced with '%20')
     * @param str input string
     * @param length length of input string
     * @return urlified string
     * @runtime O(n)
     */
    public String URLify(String str, int length){
        char[] charStr = str.toCharArray();
        int idx = 0;

        for(char c : charStr) {
            if(c == ' '){
                length+=2;
            }
        }
        char[] newStr = new char[length];

        for(char c : charStr) {
            if(c == ' '){
                newStr[idx] = '%';
                newStr[idx+1] = '2';
                newStr[idx+2] = '0';
                idx +=3;
            } else {
                newStr[idx] = c;
                idx +=1;
            }
        }
        return new String(newStr);
    }
}
