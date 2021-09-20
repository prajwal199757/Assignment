package JUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {

    private static Number num;

    @BeforeAll
    public static void doinit() {
        num = new Number();
    }

    @Test
    public void test_pelindrom() {
        num.setNum(121);
        num.getNum();
        assertEquals(Boolean.TRUE, num.CheckPelindrom(num.getNum()));
        //assertEquals(Boolean.FALSE, num.CheckPelindrom(128));
    }

    @Test
    public void test_prime() {
        assertEquals(2, num.checkPrime(2));
    }

    @Test
    public void test_armstrong() {
        assertEquals(Boolean.FALSE, num.checkAmstrong(121));
        assertEquals(Boolean.TRUE, num.checkAmstrong(153));
    }
}
