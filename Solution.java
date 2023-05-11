import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int titleToNumber(String columnTitle) {

        String numStr = "";
        char[] chars = columnTitle.toCharArray();
        Map<Character, String> alphabetMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char alphabet = (char) ('A' + i);
            alphabetMap.put(alphabet, String.valueOf(i+1));
        }


        for (char aChar : chars) {
            if (alphabetMap.containsKey(aChar)) numStr += alphabetMap.get(aChar);
        }


        return Integer.parseInt(numStr);
    }
}
