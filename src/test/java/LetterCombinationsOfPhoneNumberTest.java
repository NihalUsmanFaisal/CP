import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfPhoneNumberTest {

    private static LetterCombinationsOfPhoneNumber letterCombinationsOfPhoneNumber;

    @BeforeAll
    public static void initialize(){
        letterCombinationsOfPhoneNumber = new LetterCombinationsOfPhoneNumber();
    }

    @BeforeEach
    public void clearRestult(){
        letterCombinationsOfPhoneNumber.setResult(new ArrayList<>());
    }

    @Test
    public void emptyNumber(){
        String input = "";
        List<String> output = new ArrayList<>();
        Assertions.assertEquals(output,letterCombinationsOfPhoneNumber.solution(input));
    }

    @Test
    public void sampleInput(){
        String input = "23";
        List<String> output = new ArrayList<>();
        output.addAll(Arrays.asList(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}));
        Assertions.assertEquals(output,letterCombinationsOfPhoneNumber.solution(input));
    }

}
