class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int [][] ret=new int[n-2][n-2];

        for(int a=0;a<n-2;a++){
            int []first=grid[a];
            int []second=grid[a+1];
            int []third=grid[a+2];
            for(int b=0;b<n-2;b++){
                int max=0;
                for(int c=b;c<b+3;c++){
                    max=Math.max(max,first[c]);
                }
                for( int d=b;d<b+3;d++){
                    max=Math.max(max,second[d]);
                }
                for(int e=b;e<b+3;e++){
                    max=Math.max(max,third[e]);
                }
                ret[a][b]=max;
            }
        }
        return ret;

        
    }
}