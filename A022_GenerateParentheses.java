package leetcoder.LeetCoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yanghang on 2018/3/30.
 * for The knowledge system
 */
public class A022_GenerateParentheses {
//    public static List<String> generateParenthesis(int n) {
//        Set<String> set = new HashSet<>();
//        List<String> list2 = new ArrayList<>();
//        if(n==1){
//            set.add("()");
//        }else{
//            list2 = generateParenthesis(n-1);
//            for(String s:list2){
//                set.add("("+s+")");
//                set.add("()"+s);
//                set.add(s+"()");
//            }
//        }
//
//        return new ArrayList<>(set);
//    }

    public static void main(String[] args) {
        List<String> list = generateParenthesis2(4);
        int lineNum=1;
        for (String s:list){
            System.out.println(lineNum+": "+s);
            lineNum++;
        }
    }

    public static List<String> generateParenthesis2(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public static void backtrack(List<String> list, String str, int open, int close, int max){

        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }
}
