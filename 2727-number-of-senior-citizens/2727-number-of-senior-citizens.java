class Solution {
    public int countSeniors(String[] details) {
        int a =0;
        for(var b : details){
            int c = Integer.parseInt(b.substring(11,13));
            if(c>60){
                a++;
            }
        }
        return a;
    }
}