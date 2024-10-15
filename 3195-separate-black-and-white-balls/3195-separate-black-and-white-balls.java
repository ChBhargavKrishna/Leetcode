class Solution {
    public long minimumSteps(String s) {
        long s1 =0;
        int a =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                s1 += (long)a;
            }
            else{
                a++;
            }
        }
        return s1;
    }
}