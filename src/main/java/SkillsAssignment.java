import java.util.Arrays;

public class SkillsAssignment {
    /**
     * This is a Two Sum Challenge program in java:
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     *
     * @author Noam Heller
     */

    public static void main(String[] args) {
        int[] nums = {3, 2, 4,};
        int target = 6;
        int length = nums.length;
        int[] index = new int[2];
        if (length == 2) {
            index[0] = 0;
            index[1] = 1;
            System.out.println(Arrays.toString(index));
        } else {
            for (int i = 0; i <length; i++) {
                for (int j = i+1; j < length; j++) {
                    if (nums[i] + nums[j] == target){
                        index[0] = i;
                        index[1] = j;
                        System.out.println(Arrays.toString(index));
                        break;
                    }
                }
            }
        }
    }
}
