package leetcoder.LeetCoder;

/**
 * Created by yanghang on 2018/3/30.
 * for The knowledge system
 */
public class A171_ExcelSCN {
    public static int titleToNumber(String s) {
        int num = 0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            num+=((int)c-(int)'A'+1)*(int)Math.pow(26,s.length()-i-1);
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
