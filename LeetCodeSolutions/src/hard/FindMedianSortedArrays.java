package hard;

public class FindMedianSortedArrays {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int mn = n + m;
        int res[] = new int[mn];

        int i=0, j=0, k=0;

        while (i<n && j<m) {
            if(nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        while (i<n) {
            res[k++] = nums1[i++];
        }

        while (j<m) {
            res[k++] = nums2[j++];
        }

        if(mn%2==0) 
            return (float)(res[mn/2-1] + res[mn/2])/2;
        else
            return res[mn/2];
        
    }

}
