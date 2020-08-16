import java.util.Arrays;

/**
 * ClassName: Test
 * Description:
 * date: 2020/8/9 10:58 下午
 *
 * @author nje
 * @since JDK 1.8
 */
public class Solution_0814 {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(i, i + 1, nums);
            }
        }
    }

    private static void swap(int start, int index, int[] nums) {
        if (index >= nums.length) {
            return;
        }
        if (nums[index] != 0) {
            nums[start] = nums[index];
            nums[index] = 0;
            return;
        }
        swap(start, ++index, nums);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
