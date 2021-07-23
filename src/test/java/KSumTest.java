import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSumTest {

    private static KSum kSum;

    @BeforeAll
    public static void initialize(){
        kSum = new KSum();
    }

    @Test
    public void firstTest(){
        int[] input = new int[]{};
        List<List<Integer>> output = new ArrayList<>();;
        Assertions.assertEquals(output,kSum.solution(input));
    }

    @Test
    public void fistLeetCodeError(){
        int[] input = new int[]{0,0,0};
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(0,0,0));
        Assertions.assertEquals(output,kSum.solution(input));
    }


}
