import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

    private List<String> result = new ArrayList<>();

    private String nums;

    private String[] getNumeric(char num){
        switch (num){
            case '2':
                return new String[]{"a","b","c"};

            case '3':
                return new String[]{"d","e","f"};

            case '4':
                return new String[]{"g","h","i"};

            case '5':
                return new String[]{"j","k","l"};

            case '6':
                return new String[]{"m","n","o"};

            case '7':
                return new String[]{"p","q","r","s"};

            case '8':
                return new String[]{"t","u","v"};

            default:
                return new String[]{"w","x","y","z"};
        }
    }

    public List<String> solution(String nums){
        this.nums = nums;
        solve("",0);
        return result;
    }

    private void solve(String answer ,int index){
        if(nums.length() ==0) return;
        if(nums.length() == index) {
            result.add(answer);
            return;
        }
        for(String character : getNumeric(nums.charAt(index))){
            solve(answer+character,index+1);
        }
    }

    public void setResult(List<String> result) {
        this.result = result;
    }
}
