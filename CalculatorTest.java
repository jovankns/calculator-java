import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSabiranje() {
        String izraz = "2+3";
        String rezultat = Calculator.Run(izraz);
        assertEquals("5", rezultat);
    }

    // Dodati još testova za druge operacije
}