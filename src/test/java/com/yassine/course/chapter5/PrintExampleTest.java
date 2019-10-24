package com.yassine.course.chapter5;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;


class PrintExampleTest {

    private final ByteArrayOutputStream nonStandardOut = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    public void setUpStream() {
        System.setOut(new PrintStream(nonStandardOut));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(standardOut);
    }

    @Test
    public void out() {
        PrintExample.print("This method print text.");
        assertThat(nonStandardOut.toString()).isEqualTo("This method print text." + System.getProperty("line.separator") );
    }
}