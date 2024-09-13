class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a = arr.length;
        int b = queries.length;
        int[] str = new int[a];
        str[0] = arr[0];
        for (int i = 1; i < a; i++) {
            str[i] = str[i - 1] ^ arr[i];
        }
        int[] str1 =new int[b];
        for(int i=0;i<b;i++){
            int l =queries[i][0];
            int r = queries[i][1];
            if(l ==0){
                str1[i] =str[r];
            }else{
                str1[i] = str[r]^str[l-1];
            }
        }
        return str1;
    }
}