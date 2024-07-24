import java.util.*;
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int a = nums.length;
        int[][] m1 = new int[a][2];
        for(int i=0;i<a;++i){
            int o1 = nums[i];
            int m2 = o1 ==0 ? mapping[0] :0;
            int p1 =1;
            while(o1>0){
                int d = o1 % 10;
                m2 += p1 * mapping[d];
                p1 *= 10;
                o1 /=10;
            }
            m1[i] =new int[] {m2,i};
        }
        Arrays.sort(m1,(b,c) -> b[0]==c[0] ? b[1]-c[1]:b[0]-c[0]);
        int[] s1 = new int[a];
        for(int i=0;i<a;i++){
            s1[i] =nums[m1[i][1]];
        }
        return s1;
    }
}