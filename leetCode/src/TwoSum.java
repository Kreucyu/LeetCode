public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
        int sum[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = 1; j < nums.length; j++) {
                if(value + nums[j] == target && j != i) {
                    sum[0] = i;
                    sum[1] = j;
                    break;
                }
            }
        }
        return sum;
    }
    }

