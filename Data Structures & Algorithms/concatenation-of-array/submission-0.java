class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int arr[] = new int[2*l];
        for (int i=0;i<arr.length;i++){
            if(i<l)
                arr[i] = nums[i];
            else
                arr[i] = nums[i-l];
        }
        return arr;
        
    }
}