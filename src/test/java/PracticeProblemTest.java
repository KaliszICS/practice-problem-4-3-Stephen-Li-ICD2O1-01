import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeProblemTest {

    // ─────────────────────────────────────────────
    // Problem 1 – Positive Integer
    // ─────────────────────────────────────────────

    @Test
    public void testQ1PositiveOnFirstTry() {
        String data = "5\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        assertEquals("Input a positive integer: 10\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1OneNegativeBeforeValid() {
        String data = "-1\n7\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        assertEquals("Input a positive integer: Input a positive integer: 14\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1TwoNegativesThenZero() {
        String data = "-1\n-5\n0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        assertEquals("Input a positive integer: Input a positive integer: Input a positive integer: 0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1LargePositiveInteger() {
        String data = "100\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        assertEquals("Input a positive integer: 200\n", bos.toString());
        System.setOut(originalOut);
    }

    // ─────────────────────────────────────────────
    // Problem 2 – Password Confirmation
    // ─────────────────────────────────────────────

    @Test
    public void testQ2PasswordMatchFirstTry() {
        String data = "Hello\nHello\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        assertEquals("Input a password: Confirm the password: success.\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2PasswordMismatchOnceThenMatch() {
        String data = "Hello\nBye\nHello\nHello\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        assertEquals("Input a password: Confirm the password: Input a password: Confirm the password: success.\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2TwoMismatchesThenMatch() {
        String data = "Hello\nhello\nHello\nBye\nBye\nBye\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        assertEquals("Input a password: Confirm the password: Input a password: Confirm the password: Input a password: Confirm the password: success.\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2CaseSensitiveMismatch() {
        String data = "hello\nHello\nhello\nhello\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        assertEquals("Input a password: Confirm the password: Input a password: Confirm the password: success.\n", bos.toString());
        System.setOut(originalOut);
    }

    // ─────────────────────────────────────────────
    // Problem 3 – Multiple Check
    // ─────────────────────────────────────────────

    @Test
    public void testQ3ValidMultipleFirstTry() {
        String data = "5\n10\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        assertEquals("Input an integer: Input an integer that is a multiple of the first integer: success.\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3InvalidMultipleOnceThenValid() {
        String data = "5\n7\n7\n14\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        assertEquals("Input an integer: Input an integer that is a multiple of the first integer: Input an integer: Input an integer that is a multiple of the first integer: success.\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3TwoInvalidMultiplesThenValid() {
        String data = "5\n12\n2\n9\n4\n8\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        assertEquals("Input an integer: Input an integer that is a multiple of the first integer: Input an integer: Input an integer that is a multiple of the first integer: Input an integer: Input an integer that is a multiple of the first integer: success.\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3NegativeBaseWithNegativeMultiple() {
        String data = "-3\n-9\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        assertEquals("Input an integer: Input an integer that is a multiple of the first integer: success.\n", bos.toString());
        System.setOut(originalOut);
    }
}