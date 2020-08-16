import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution
 * Description:
 * date: 2020/8/16 5:12 下午
 *
 * @author nje
 * @since JDK 1.8
 */
public class Solution_0815 {
    public static List<List<Integer>> threeSum(int[] nums) {
        //1、数组重排序（从小到大）
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        //2、从第一个数开始遍历
        for (int k = 0; k < nums.length - 2; k++) {
            int i = k + 1, j = nums.length - 1;
            //因为已排序，当前值若大于零，则后面的数都大于零，和也大于零
            if (nums[k] > 0) {
                break;
            }
            // 若当前值与上一次循环的数字一样，跳过循环
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            //3、双指针夹逼遍历
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) {
                    }
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) {
                    }
                } else {
                    results.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[++i]) {
                    }
                    while (i < j && nums[j] == nums[--j]) {
                    }
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        final List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists.toString());
    }
}
