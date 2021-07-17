import java.util.Arrays;

public class ValidTriangleNumber {

    public int solution(int[] nums){
        int result = 0;
        Arrays.sort(nums);
        for(int i=2;i < nums.length;i++){
            int left = 0;
            int right = i -1;
            while(left < right){
                if(nums[left] + nums[right] > nums[i]){
                    result += (right - left);
                    right --;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }
}
