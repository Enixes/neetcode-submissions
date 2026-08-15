class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;

        if (nums1.length > nums2.length) {
            A = nums2;
            B = nums1;
        }

        int start = 0;
        int end = A.length - 1;
        int half = (A.length + B.length) / 2;
        int total = A.length + B.length;

        // binary search
        while (true) {

            // FIX #1: Java needs floor division here
            int midA = Math.floorDiv(start + end, 2);
            int midB = half - midA - 2;

            int Aleft = midA >= 0
                    ? A[midA]
                    : Integer.MIN_VALUE;

            int Aright = midA < A.length - 1
                    ? A[midA + 1]
                    : Integer.MAX_VALUE;

            int Bleft = midB >= 0
                    ? B[midB]
                    : Integer.MIN_VALUE;

            int Bright = midB < B.length - 1
                    ? B[midB + 1]
                    : Integer.MAX_VALUE;

            if (Aleft <= Bright && Bleft <= Aright) {

                if (total % 2 != 0)
                    // FIX #2
                    return Math.min(Aright, Bright);

                // FIX #3: prevent integer overflow
                return ((double) Math.max(Aleft, Bleft)
                        + Math.min(Aright, Bright)) / 2.0;

            } else if (Aleft > Bright) {
                end = midA - 1;

            } else {
                start = midA + 1;
            }
        }
    }
}