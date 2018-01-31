/*
判断list中的每一个单词是否能用键盘中的每一行组合。
//把每一行加到一个Map中，依次读word，看map中的second value是不是相等的。
==> Java对于未知长度的Array的处理。(题目要求返回Array，可是又是未知长度)
先用LinkedList: List<String> res = new LinkedList<>();
push_back元素:  res.add(words[i]);
返回时转换为Array:  return res.toArray(new String[res.size()]);
//注意Java中List, Set, Vector等容器，需要用size()来得到大小，而非length.
size() is a method specified in java.util.Collection
*/

class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new LinkedList<>();
        String[] list={"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<list.length;i++)
        {
            char[] row = list[i].toCharArray();
            for(int j=0;j<row.length;j++)
            {
                map.put(row[j],i+1);
            }
             
        }
        for(int i=0;i<words.length;i++)
        {
            char[] t = words[i].toCharArray();
            int num=0;
            boolean flag=true;
            for(int j=0;j<t.length;j++)
            {
                if(num==0)
                    num=map.get(t[j]);                   
                if(num!=0 && map.get(t[j])!=num)
                {
                    j=t.length;
                    flag=false;
                }
            }
            if(flag)
                res.add(words[i]);
            
        }
       return res.toArray(new String[0]);
    }
}