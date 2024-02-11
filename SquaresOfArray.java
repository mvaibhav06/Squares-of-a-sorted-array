import java.util.Arrays;

public class SquaresOfArray {
    public static int[] sortedSquares(int[] nums){
        int[] out = new int[nums.length];

        for (int i=0; i<nums.length; i++){
            out[i] = nums[i]*nums[i];
        }
        Arrays.sort(out);
        return out;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
