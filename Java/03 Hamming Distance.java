/*
	两个数的Hamming距离就是：两个数在各bit上不同的个数。
	1   (0 0 0 1)
	4   (0 1 0 0)
      	   ↑   ↑ =2;

	==>计算 a ^ b 中1的个数即可。
	Integer.bitCount(x)
	返回int,long类型的数值在二进制下“1”的数量。 

*/

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
        
    }
}