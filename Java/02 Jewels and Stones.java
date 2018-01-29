/*
给定一个集合S，算出集合J中所有元素在S中出现的次数。（case sensetive.）
Input: J = "aA", S = "aAAbbbb"
Output: 3

==>Set的使用.
!!!Java的容器中只能存放引用数据类型(Integer)，不能放基本数据类型(int)。    vs  放啥都行
	Set<type> s = new HashSet();         vs    unordered_set<type> s;
	s.add(a);							 vs    s.emplace(a);
	s.contains(a). 						 vs    s.count(a);							

*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        int res=0;
        Set<Character> s = new HashSet();
        for(char c:J.toCharArray())
            s.add(c);
        for(char c:S.toCharArray())
        {
            if(s.contains(c))
                res++;
        }
        return res;
    }
}