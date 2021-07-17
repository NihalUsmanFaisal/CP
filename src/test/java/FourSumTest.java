import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumTest {

    private static FourSum fourSum;

    @BeforeAll
    public static void initialize(){
        fourSum = new FourSum();
    }

    @Test
    public void allTwos(){
        int[] input = new int[]{2,2,2,2,2};
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(2,2,2,2));
        Assertions.assertEquals(output,fourSum.solution(input,8));
    }

}
