public class ValidTriangleNumber {

    private int canFormTriangle(int a, int b, int c){
        if(a+b > c && b+c > a && a+c > b) return 1;
        return 0;
    }

    public int solution(int[] nums){
        int result = 0;
        if(nums.length < 3){
            return result;
        }
        for(int i = 0; i < nums.length-2;i++){
            for(int j = i+1; j < nums.length-1 ; j++){
                for(int k = j+1; k < nums.length; k++){
                    result += canFormTriangle(nums[i],nums[j],nums[k]);
                }
            }

        }
        return result;
    }
}
