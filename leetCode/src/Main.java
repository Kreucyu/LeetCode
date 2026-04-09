//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            TwoSum twoSum = new TwoSum();
            //int nums[] = {2, 7, 11, 15};
            //int target = 9;
            //int nums[] = {3,3};
            //int target = 6;
            int nums[] = {-1,-2,-3,-4,-5};
            int target = -8;
            int sum[] = twoSum.twoSum(nums, target);
            for(int i = 0; i < sum.length; i++) {
                System.out.println(sum[i] + " . ");
            }
    }
}