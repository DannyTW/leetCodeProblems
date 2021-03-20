public class Main {
    public static void main(String[] args) {

        /** two-sum
        try {
            int[] nums = {2, 5, 5, 11};
            int target = 1;

            int[] result = ProdClasses.Twosum.twoSum(nums, target);
            for (int number : result) {
                System.out.println(number);
            }
        } catch (Exception exc) {
            System.out.println("An exception was thrown:" + exc);
        }
        **/

        /** Contains Duplicate */
        int[] nums = {1,2,3,1};
        System.out.println(ProdClasses.ContainsDuplicate.containsDuplicate(nums));

        int[] nums1 = {1,2,3,4};
        System.out.println(ProdClasses.ContainsDuplicate.containsDuplicate(nums1));

        int[] nums2 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(ProdClasses.ContainsDuplicate.containsDuplicate(nums2));

        int[] nums3 = {1,4,7,8,23,12,5,1023,9,10,11,12,13,14,15,16,17,9};
        System.out.println(ProdClasses.ContainsDuplicate.containsDuplicate(nums3));

         /**/

        /* Best Time to Buy and Sell Stock */


    }
}

