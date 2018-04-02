package leetcoder.LeetCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yanghang on 2018/3/29.
 * for The knowledge system
 */
public class A136_SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            result= result^nums[i];
        }
        return result;
//        List<Integer> list = new ArrayList<Integer>();
//        for(int i=0;i<nums.length;i++){
//            if(list.contains(nums[i])){
//                list.remove((Integer) nums[i]);
//            }else{
//                list.add(nums[i]);
//            }
//        }
//        return list.get(0);
//        List list = Arrays.asList(nums);
//        List list2 = new ArrayList<>();
//        for(Object i : list){
//            if(list.indexOf(i)==list.lastIndexOf(i)){
//                list2.add(i);
//            }
//        }
//        return (Integer)list2.get(0);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2};
        System.out.println(singleNumber(nums));
    }
}
