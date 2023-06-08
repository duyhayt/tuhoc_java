package ThuatToan;

import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {2, 7, 11, 15};
    int target = 18;
    int[] result = solution.twoSum(nums, target);
    System.out.println(result[0] + " " + result[1]);
  }

}

class Solution {

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (numMap.containsKey(complement)) {
        return new int[]{numMap.get(complement), i};
      }
      numMap.put(nums[i], i);
    }
    return null;
  }
}
