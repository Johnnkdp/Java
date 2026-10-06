    public int minGroups(int[][] intervals) {
        int arrivals[]= new int[intervals.length];   //T.C = O(nlogn + n) and S.C = O(1)
        int departure[]= new int[intervals.length];
        for( int i =0; i < intervals.length; i++){
             arrivals[i] = intervals[i][0];
             departure[i] = intervals[i][1];
        }
        Arrays.sort(arrivals);
        Arrays.sort(departure);
        int i =0;
        int j =0;
        int count = 0;
        int maxcount =0;
        while(i<intervals.length){
            if(arrivals[i] <= departure[j]){
               count+=1;
               i+=1;
            }
            else{
                 count-=1;
                j+=1;  
            }
                maxcount = Math.max(count, maxcount);
            
        }
        return maxcount;
        
    }
}