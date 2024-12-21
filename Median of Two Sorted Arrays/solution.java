class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1+n2;
        int[] ans = new int[n3];

        int i=0,j=0,k=0;

        while(i<n1)
        {
            ans[k++]=nums1[i++];
        }

        while(j<n2)
        {
            ans[k++]=nums2[j++];
        }
        Arrays.sort(ans);

        // if(n3%2!=0)
        // {
        //     int a1 = n3/2;
        //     return ans[a1+1];
        // }
        for(int d=0;d<n3;d++)
        {
            System.out.print(ans[d]+" ");
        }
        if(n3%2 != 0)
        {
            int n = n3/2;
            // System.out.print("n = " + n);
            return ans[n];
        }
        else
        {
            int n = n3/2;
            int s = n-1;
            // System.out.print("n = " + ans[n]+ "s= "+ans[s]);
            int ans1 = ans[n] + ans[s];
            double ans2 = (double)ans1/2;
            return ans2;
        }
      

    } 
}
