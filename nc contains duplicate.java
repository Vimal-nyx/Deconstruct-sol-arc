class Solution {
    public boolean hasDuplicate(int[] nums) {
        int [] nums2= Arrays.stream(nums).distinct().toArray();
        return nums.length!=nums2.length;
        
    }
}
