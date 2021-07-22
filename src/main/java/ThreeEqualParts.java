import java.util.Arrays;
import java.util.stream.IntStream;

public class ThreeEqualParts {
    private int subarraySum(int[] nums){
        return IntStream.of(nums).sum();
    }

    public int[] solutions(int[] arr){
        int totalOnes = 0;
        for(int digit : arr){
            if (digit == 1){
                totalOnes ++ ;
            }
        }
        if(totalOnes % 3 != 0){
            return new int[]{-1,-1};
        }
        int oneEachPart = totalOnes/3;
        int low = 0;
        int high = arr.length -1;
        int firstCount = 0;
        int secondCount = 0;
        while(low < high-1){
            if(firstCount == oneEachPart && secondCount == oneEachPart){
                int sumLow = subarraySum(Arrays.copyOfRange(arr,0,low+1));
                int sumBetween = subarraySum(Arrays.copyOfRange(arr,low+1,high));
                int sumHigh = subarraySum(Arrays.copyOfRange(arr,high,arr.length));
                if(sumLow == sumBetween && sumBetween == sumHigh) {
                    return new int[]{low, high};
                }
            }
            if(firstCount > oneEachPart || secondCount > oneEachPart){
                return new int[]{-1,-1};
            }
            if(arr[low] == 1){
                firstCount++;
            }
            if(arr[high] == 1){
                secondCount++;
            }
        }
        return new int[]{1};
    }
}
