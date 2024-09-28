import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class WAEngineTest {

    @Test
    public void testConst() {
        int [] globals = new int[2];
        WAEngine e = new WAEngine(new Scanner(
                "i32.const 42\n"
                + "set_global 0\n"
                ), globals);

        e.run();

        assertEquals(42, globals[0]);

        e = new WAEngine(new Scanner(
                "i32.const 12\n"
                + "i32.const 23\n"
                + "set_global 0\n"
                + "set_global 1\n"
                ), globals);

        e.run();

        assertEquals(23, globals[0]);
        assertEquals(12, globals[1]);
    }
}
