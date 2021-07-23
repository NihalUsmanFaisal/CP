import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {

    private List<List<Integer>> twoSum(int[] nums,int start,int target){
        int low = start;
        int high = nums.length -1;
        List<List<Integer>> result = new ArrayList<>();
        while (low < high){
            int sum = nums[low] + nums[high];
            if( sum < target || ( low > start && nums[low-1] == nums[low] ) ) low++;
            else if(sum > target || high < nums.length-1 && nums[high]==nums[high+1]) high--;
            else{
                List<Integer> ans = new ArrayList<>();
                ans.add(nums[low]);
                ans.add(nums[high]);
                result.add(ans);
                low++;
                high--;
            }
        }
        return result;
    }

    private List<List<Integer>> mainSolve(int[] nums,int start,int target,int k){
        List<List<Integer>> result = new ArrayList<>();
        if(start == nums.length || nums[start]*k > target || nums[nums.length-1]*k < target){
            return result;
        }
        if(k==2) return twoSum(nums,start,target);
        for(int i = start;i <= nums.length-k;i++){
            if(i== start || nums[i-1] != nums[i]){
                for(var res : mainSolve(nums,i+1,target-nums[i],k-1)){
                    res.add(nums[i]);
                    result.add(res);
                }
            }
        }
        return result;
    }

    public List<List<Integer>> solution(int[] nums){
        Arrays.sort(nums);
        return mainSolve(nums,0,0,3);
    }
}
