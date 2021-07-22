import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PushDominosTest {

    private static PushDominos pushDominos;

    @BeforeAll
    public static void initialize(){
        pushDominos = new PushDominos();
    }

    @Test
    public void firtTest(){
        String input = "RR.L";
        Assertions.assertEquals("RR.L",pushDominos.solution(input));
    }

    @Test
    public void secondTest(){
        String input = ".L.R...LR..L..";
        Assertions.assertEquals("LL.RR.LLRRLL..",pushDominos.solution(input));
    }

}
