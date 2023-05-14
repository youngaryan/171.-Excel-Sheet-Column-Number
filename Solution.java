import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int titleToNumber(String columnTitle) {

        int num = 0 ;
        Map<Character, Integer> alphabetMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char alphabet = (char) ('A' + i);
            alphabetMap.put(alphabet, i+1);
        }


        for (int i = 0; i < columnTitle.length()-1; i++) {
            num += alphabetMap.get(columnTitle.charAt(i))*(int)Math.pow(26,columnTitle.length()-1-i);

        }

        num+=alphabetMap.get(columnTitle.charAt(columnTitle.length()-1));
        //throw new RuntimeException(num+String.valueOf(alphabetMap));
        return num;





        //throw new RuntimeException(String.valueOf(alphabetMap)+ columnTitle.substring(columnTitle.length()-1));

    }
}
