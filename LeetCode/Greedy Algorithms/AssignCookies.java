   public int findContentChildren(int[] g, int[] s) {
        int l = g.length;
        int p = s.length;
        int m = 0;
        int n = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while( m < l  && n < p ){
            if(g[m] <= s[n]){
                m = m+1;
            }
            n = n+1;
        }
        return m;
        
    }
}