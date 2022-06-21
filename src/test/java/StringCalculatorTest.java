import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculatorTest manipulatedstring;

    @BeforeEach
    public void setUp() {
        manipulatedstring = new StringCalculatorTest();
    }


    @AfterEach
    public void tearDown() {
        manipulatedstring = null;
    }

    @Test
    public void testCount1() {
        int calc = manipulatedstring.add("");
        assertEquals(0, add);
    } // test given by professor

    @Test
    public void testCount1() {
        int calc = manipulatedstring.add("-5, 5");
        assertEquals(0, add);
    } // test given by professor

    @Test
    public void testCount1() {
        int calc = manipulatedstring.add("-5, 1000");
        assertEquals(0, add);
    } // test given by professor

// NOT ENOUGH TIME FOR TESTING