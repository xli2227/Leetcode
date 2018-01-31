/*
reverse String.
参见第10题的做法既可。
*/

class Solution {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length/2;i++)
        {
            char temp = ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]= temp;
        }
        return String.valueOf(ch);
    }
}

class Solution {
    public String reverseString(String s) {
        StringBuilder res=new StringBuilder();
        res.append(new StringBuffer(s).reverse().toString());
        return res.toString();
    }
}