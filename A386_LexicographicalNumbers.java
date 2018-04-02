package leetcoder.LeetCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanghang on 2018/3/30.
 * for The knowledge system
 */
public class A386_LexicographicalNumbers {
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>(n);
        int curr =1;
        for (int i=1;i<n+1;i++){
            list.add(curr);
            if(curr*10<=n){
                curr*=10;
            }else if(curr%10!=9&&curr+1<=n){
                curr++;
            }else {
                while((curr/10)%10==9){
                    curr/=10;
                }
                curr = curr/10+1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = lexicalOrder(23);
        for (int i:list){
            System.out.println(i);
        }
    }
}
