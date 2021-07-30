import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {

    private static UniquePaths uniquePaths;

    @BeforeAll
    public static void initialize(){
        uniquePaths = new UniquePaths();
    }

    @Test
    public void firstTest(){
        int m = 3 ;
        int n  = 7;
        Assertions.assertEquals(28,uniquePaths.uniquePaths(m,n));

    }

    @Test
    public void secondTest(){
        int m = 3;
        int n = 3;
        Assertions.assertEquals(6,uniquePaths.uniquePaths(m,n));
    }

    @Test
    public void thirdTest(){
        int m = 3;
        int n = 2;
        Assertions.assertEquals(3,uniquePaths.uniquePaths(m,n));
    }
}
