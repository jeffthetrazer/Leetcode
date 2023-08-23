class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j=1;
        int[] temp= new int[nums.length];
        for(i =1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
            }
            return j;
        }

    }