package leetcoder.LeetCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanghang on 2018/3/27.
 * for The knowledge system
 */
public class A412_FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                ret.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ret.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ret.add("Buzz");
                buzz=0;
            }else{
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
    public static void main(String[] args){
        List<String> ret = fizzBuzz(18);
        for(int i=0;i<ret.size();i++){
            System.out.println(ret.get(i));
        }
    }
}
