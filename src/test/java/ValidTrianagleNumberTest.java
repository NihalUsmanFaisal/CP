import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ValidTrianagleNumberTest {

    private static   ValidTriangleNumber validTriangleNumber;

    @BeforeAll
    public static void initialize(){
        validTriangleNumber = new ValidTriangleNumber();
    }

    @Test
    public void lengthLessThanTwo(){
        Assertions.assertEquals(0,validTriangleNumber.solution(new int[]{1, 3}));
    }

    @Test
    public void genericInput(){
        Assertions.assertEquals(4,validTriangleNumber.solution(new int[]{4,2,3,4}));
    }
}
