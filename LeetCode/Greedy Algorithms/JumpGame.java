    public boolean canJump(int[] nums) {
        int maxreach = 0;
        for(int i =0; i <= nums.length-1; i++){
            if(i > maxreach) return false;
                maxreach = Math.max(maxreach, i + nums[i]);
            
        }
        return true;
    }
}