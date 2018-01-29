/*
给定数组moves，其中包含L,R,U,D四个方向，判断最后是否转回来了。
==》toCharArray()，名字别弄错了。
*/
class Solution {
    public boolean judgeCircle(String moves) {
        int h=0;
        int v=0;
        for(char c:moves.toCharArray())
        {
            if(c=='U') v++;
            if(c=='D') v--;
            if(c=='L') h--;
            if(c=='R') h++;
        }
        return h==0 && v==0;
    }
}