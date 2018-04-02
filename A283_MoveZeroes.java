package leetcoder.LeetCoder;

/**
 * Created by yanghang on 2018/3/30.
 * for The knowledge system
 */
public class A283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int  isNotZeroCounts = 0;
        for(int num:nums){
            if(num!=0) nums[isNotZeroCounts++] = num;
        }
        while (isNotZeroCounts<nums.length){
            nums[isNotZeroCounts++]=0;
        }
    }
}
