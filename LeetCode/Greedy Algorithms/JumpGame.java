    public boolean canJump(int[] nums) {
        int maxreach = 0;
        for(int i =0; i <= nums.length-1; i++){
            if(i > maxreach) return false;                     //T.C = O(n)
                maxreach = Math.max(maxreach, i + nums[i]);    // S.C = O(1)
            
        }
        return true;
    }
}