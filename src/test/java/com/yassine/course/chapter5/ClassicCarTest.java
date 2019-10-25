package com.yassine.course.chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClassicCarTest {

    private final ByteArrayOutputStream anotherOut = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;;

    @BeforeEach
    public void setUpStream() {
        System.setOut(new PrintStream(anotherOut));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(standardOut);
    }

    @Test
    public void should_print_Vehicle_then_Car_when_calling_super_constructors() {

        new ClassicCar();
        assertThat(anotherOut.toString()).
                isEqualTo("Vehicle" + System.getProperty("line.separator")
                        + "Car" + System.getProperty("line.separator"));
    }
}
