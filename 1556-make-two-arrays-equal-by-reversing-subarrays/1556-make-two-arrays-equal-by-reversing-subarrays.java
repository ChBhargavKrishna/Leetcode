class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
      int[] a = new int[1001];
      int[] b = new int[1001];
      for(int s: target){
        a[s]++;
      } 
      for(int s : arr){
        b[s]++;
      } 
      return Arrays.equals(a,b);
    }
}