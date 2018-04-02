package leetcoder.LeetCoder;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yanghang on 2018/3/27.
 * for The knowledge system
 */
public class A771_JewelsStones {
    public int numJewelsInStones(String J, String S) {
        Set set = new HashSet();
        int num = 0;
        for(int i=0;i<J.length();i++){
            char c = J.charAt(i);
            set.add(c);
        }
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(set.contains(c)){
                num++;
            }
        }
        return num;
    }
}
