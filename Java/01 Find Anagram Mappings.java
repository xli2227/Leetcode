/*
给定数组A，以及将其打乱后的数组B.
欲求A中各元素在B中的编号。

A = [12, 28, 46, 32, 50]
B = [50, 12, 32, 46, 28]
We should return
[1, 4, 3, 2, 0]

==》Java中HashMap的使用
HashMap<type,type> m = new HashMap();     vs    unordered_map<type,type> m;
m.put(a,b);								  vs    m[a]=b;
m.get(a);								  vs    m[a];

*/

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer,Integer> map = new HashMap();
        int[] res = new int[A.length];
        for(int i=0;i<B.length;i++)
            map.put(B[i],i);
        for(int i=0;i<A.length;i++)
        {
            res[i]=map.get(A[i]);
        }
        return res;
    }
}