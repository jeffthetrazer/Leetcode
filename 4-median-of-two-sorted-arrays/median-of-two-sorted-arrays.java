class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        double median;

        int n3 = n1+n2;
        int[] finalArr = new int[n3];
        System.arraycopy(nums1,0,finalArr,0,n1);
        System.arraycopy(nums2,0,finalArr,n1,n2);

        Arrays.sort(finalArr);

        if(n3%2==0){
            median = (finalArr[n3/2]+finalArr[n3/2-1])/2.0;
        }
        else{
            median = finalArr[n3/2];
        }
        return median;
    }
}