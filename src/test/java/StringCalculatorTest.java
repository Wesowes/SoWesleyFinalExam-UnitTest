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
        manipulatedstring.setString("This is my string");
        int length = manipulatedstring.count();
        assertEquals(4, length);
    } // test given by professor

    @Test //first case
    public void testCount2() {
        manipulatedstring.setString("H  e l l o");
        int length = manipulatedstring.count();
        assertEquals(5, length);
    } // test to see if its counting the letters as "words", extra space included to test similar feature

    @Test
    public void testCount3() {
        manipulatedstring.setString("");
        int length = manipulatedstring.count();
        assertEquals(0, length);
    }