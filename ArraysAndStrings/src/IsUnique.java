import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    /**
     * Determines if string has duplicate characters
     * @param str input string
     * @return whether string contains unique characters
     * @runtime O(n)
     */
    public boolean isUniqueChars(String str){
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(charMap.containsKey(c)){
               return false;
            }
            else {
                charMap.put(c,1);
            }
        }
        return true;
    }

    /**
     * Determines if string has duplicate characters without using any data structures
     * @param str input string
     * @return whether string contains unique characters
     * @runtime O(nlogn)
     */
    public boolean isUniqueCharsNoDataStruct(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        for(int i = 0; i < charArr.length-1; i++){
            if(charArr[i] == charArr[i+1]){
                return false;
            }
        }
        return true;
    }

}


