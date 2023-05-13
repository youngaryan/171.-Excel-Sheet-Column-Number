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

        if (columnTitle.length()<2){
            for (char aChar : chars) {
               if (alphabetMap.containsKey(aChar)) numStr += alphabetMap.get(aChar);
          }

            return Integer.parseInt(numStr);
        }else{
            int length = (columnTitle.length()-1)*26;
            numStr += alphabetMap.get(columnTitle.charAt(columnTitle.length()-1));
            //throw new RuntimeException(numStr);
            return Integer.parseInt(numStr)+length;
        }




        //throw new RuntimeException(String.valueOf(alphabetMap)+ columnTitle.substring(columnTitle.length()-1));

    }
}
