/*
一个长为2n的数组，把他们组成n个pair，使得
sum_min(ai,bi)足够大。
==>实际上就是找排序后的偶数位。
Java数列排序
Arrays.sort(); 是Arrays
*/

class Solution {
    public int arrayPairSum(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2)
        {
            res+=nums[i];
        }
        return res;
    }
}