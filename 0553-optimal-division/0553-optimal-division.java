class Solution {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        double[][][] dp = new double[n][n][2];
        String[][][] dps = new String[n][n][2];
        
        for(int i = 0 ; i <n ;i++){
            for(int j = 0 ; j <n ;j++)
                dp[i][j][1] = Double.MAX_VALUE;
        }
        
        for(int i = 0; i<n;i++){
            dp[i][i][0]=nums[i];
            dp[i][i][1] = nums[i];
            dps[i][i][0]=String.valueOf(nums[i]);
            dps[i][i][1] = String.valueOf(nums[i]);
        }
        
        for(int i = 1 ; i< n;i++){
            for(int j = 0 ; j< n-i;j++){
                for(int k = j ;k<i+j;k++){
                    if(dp[j][k][0]/dp[k+1][i+j][1]> dp[j][i+j][0]){
                        dp[j][i+j][0] = dp[j][k][0]/dp[k+1][i+j][1];
                        dps[j][i+j][0] = dps[j][k][0]+"/"+ ((k+1 == i+j)? "":"(")+dps[k+1][i+j][1]+((k+1 == i+j)? "":")");
                    }
                    
                    if(dp[j][k][1]/dp[k+1][i+j][0]< dp[j][i+j][1]){
                        dp[j][i+j][1] = dp[j][k][1]/dp[k+1][i+j][0];
                        dps[j][i+j][1] = dps[j][k][1]+"/"+((k+1 == i+j)? "":"(")+dps[k+1][i+j][0]+((k+1 == i+j)? "":")");
                    }
                }
            }
        }
        
        return dps[0][n-1][0];
    }
}