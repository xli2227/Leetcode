/*给一个包含4类字符的List:
Integer:本回合直接得分数;
"+" (one round's score):本轮得分数是上两轮的总和。
"D" (one round's score): 本轮的分数是上一轮的两倍。
"C" (an operation, which isn't a round's score):上一轮得到的分数是无效的，需要从总分中删除。
计算出这个List代表的总分。
可以用一个Vector/List来记下每一次的得分。
！！！ == 与 .equals()是有区别的：
Stringa,equals(Stringb) 是我通常在C++中认知的相等;
Stringa == Stringb 去要他们两个的内存地址相同。
*/


class Solution {
    public int calPoints(String[] ops) {
        int sum=0;
        List<Integer> p = new LinkedList();
        for(String s : ops)
        {
            int temp=0;
            if(s.equals("+"))
            {
                temp=p.get(p.size()-1)+p.get(p.size()-2);
                p.add(temp);
                            }
            else if(s.equals("D"))
            {
                temp=p.get(p.size()-1)*2;
                p.add(temp);
            }
            else if(s.equals("C"))
            {
                temp = -p.get(p.size()-1);
                p.remove(p.size()-1);
                            }
            else
            {
                temp=Integer.valueOf(s);
                p.add(temp);
            }
            sum+=temp;
        }
        return sum;
    }
}