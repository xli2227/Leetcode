/*
判断一个数是否满足以下条件：
它的每一位都能被自己整除。
128满足 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

==》List<Integer> res = new ArrayList<Integer>();
Java中需要注意：
List接口的常用实现类有ArrayList和LinkedList，
在使用List集合时，通常情况下声明为List类型，
实例化时根据实际情况的需要，实例化为ArrayList或LinkedList.


String.valueOf(n).toCharArray()可以i将数字做成String.

*/
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            int num=i;
            if(i<10)
                res.add(i);
            else
            {
                while(num>0)
                {
                    int d=num%10;
                    if(d==0 || i%d !=0)
                        break;
                    num /= 10;
                }
                if(num==0)
                    res.add(i);
                
            }
            
        }
        return res;
    }
}