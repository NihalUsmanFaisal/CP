import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    private List<List<Integer>> twoSum(int[] nums,int start,int target){
        List<List<Integer>> res = new ArrayList<>();
        int low = start;
        int high = nums.length -1;
        while(low < high){
            int sum = nums[low] + nums[high];
            if(sum > target || (high < nums.length -1 && nums[high] == nums[high+1] ) ){
                high--;
            }
            else if(sum < target || (low > start && nums[low] == nums[low-1])){
                low++;
            }
            else{
                res.add(Arrays.asList(nums[low],nums[high]));
                low++;
                high--;
            }
        }
        return res;
    }

    private List<List<Integer>> ksum(int[] nums,int start,int k,int target){
        List<List<Integer>> result = new ArrayList<>();
        if(start == nums.length || nums[start]*k > target || target > nums[nums.length-1]*k ){
            return result;
        }
        if(k==2){
            return twoSum(nums,start,target);
        }
        for(int j = start;j < nums.length;j++){
            if(j== start || nums[j] != nums[j-1]){
                for(var set : ksum(nums,j+1,k-1,target-nums[j])){
                    result.add(new ArrayList<>(Arrays.asList(nums[j])));
                    result.get(result.size()-1).addAll(set);
                }
            }
        }
        return result;
    }

    public List<List<Integer>> solution(int[] nums, int target) {
        Arrays.sort(nums);
        return ksum(nums,0,4,target);
    }
}
