class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int [(nums.length)*2];
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[i];
            count++;
        }
        int newcount = 0;
        for(int j = count; j < (nums.length)*2; j++)
        {
            ans[j] = nums[newcount];
            newcount++;
        }
        return ans;
    }
}
