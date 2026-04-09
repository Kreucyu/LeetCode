import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int[] sum = new int[2];
            for(int i = 1; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for(int i = 0; i < nums.length; i++) {
                int value = target - nums[i];
                if(map.containsKey(value) && i != map.get(value)) {
                    sum[0] = i;
                    sum[1] = map.get(value);
                    return sum;
                }
        }
        return null;
    }
}