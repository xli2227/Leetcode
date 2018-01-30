/*
将一个数的二进制表达取反。
==》关键函数Integer.highestOneBit(num)，得到num的最高位数。
该题实际上是： num + res = 2^(num的最高位+1)；
res= (1<<num的最高位) -1 - num;
*/

class Solution {
    public int findComplement(int num) {
        return ((Integer.highestOneBit(num) << 1) - 1)  - num;   
    }
}