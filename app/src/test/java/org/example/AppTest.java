/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {
    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testGetGreetingContent() {
        App app = new App();
        String greeting = app.getGreeting();
        assertEquals("Hello World!", greeting);
    }

    @Test
    public void testMainMethodOutput() {
        // 標準出力をキャプチャしてテスト
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            App.main(new String[] {});
            String output = outContent.toString();

            // 期待される出力が含まれているかチェック
            assertTrue("Output should contain Hello World!", output.contains("Hello World!"));
            assertTrue("Output should contain sum calculation", output.contains("Sum of 2 and 3 is 5"));
            assertTrue("Output should contain average calculation", output.contains("Average is 2.5"));
            assertTrue("Output should contain range sum", output.contains("Sum of 1 to 10 is 55"));
            assertTrue("Output should contain range average", output.contains("Average is 5.5"));
            assertTrue("Output should contain odd sum", output.contains("Sum of odd of 1 to 10 is 25"));
            assertTrue("Output should contain even sum", output.contains("Sum of even of 1 to 10 is 30"));

        } finally {
            // 標準出力を元に戻す
            System.setOut(originalOut);
        }
    }
}
