package leetcoder.LeetCoder;

/**
 * Created by yanghang on 2018/3/30.
 * for The knowledge system
 */
public class A387_FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            String cs=String.valueOf(s.charAt(i));
            if(s.indexOf(cs)==s.lastIndexOf(cs)){
                return i;
            }
        }
        return -1;
    }
}
