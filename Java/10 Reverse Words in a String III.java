/*
给一句用空格隔开单词的话，将话中的单词reverse.
==>在Java中有两点可以简化的地方
1.找到空格之间的word：
String words[] = s.split(" ");   vs  C++可能需要遍历判断空格的位置再处理，

2.tirm函数去除string前后的空格            vs   对末尾空格进行单独判断。

*/

class Solution {
    public String reverseWords(String s) {
        String res="";
        String words[] = s.split(" ");
        for(String word:words)
        {
            res+=reverse(word);
            res+=" ";
        }
        return res.trim();
    }
        String reverse(String s)
        {
            char[] c = s.toCharArray();
            for(int i=0;i<c.length/2;i++)
            {   
                char temp=c[i];
                c[i]=c[c.length-1-i];
                c[c.length-1-i]=temp;             
            }
            return String.valueOf(c);
        }
}



/*运用StringBuilder版
2.String的reverse
StringBuilder res=new StringBuilder();	
tringBuffer(word).reverse().toString()   vs  reverse(s.begin(),s.end());
*/

public class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }
}