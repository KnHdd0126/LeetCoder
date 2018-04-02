package leetcoder.LeetCoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yanghang on 2018/3/27.
 * for The knowledge system
 */
public class A804_MorseCode {
    public static int uniqueMorseRepresentations(String[] words){
        Map map = new HashMap<>();
        Set set = new HashSet<>();
        String[] morse = new String[]{".-","-...","-.-.","-..",".",
                "..-.","--.","....","..",".---","-.-",".-..","--",
                "-.","---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        for(int i=(int)'a';i<'a'+26;i++)
        {
            map.put((char)i,morse[i-(int)'a']);
        }

        for(int i=0;i<words.length;i++){
            String s = words[i];
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                sb.append(map.get(c));
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args){
        String[] s = new String[]{"gin", "zen", "gig", "msg"};
        System.out.print(uniqueMorseRepresentations(s));
    }
}
