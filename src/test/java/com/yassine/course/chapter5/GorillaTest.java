package com.yassine.course.chapter5;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class GorillaTest {

    @Test
    public void should_find_correct_field_values_after_calling_different_super_constructors() {

        Gorilla gorilla = new Gorilla();

        assertThat(gorilla.getAge()).isEqualTo(5);
        assertThat(gorilla.getName()).isNull();

        Gorilla gorilla_2 = new Gorilla(3);

        assertThat(gorilla_2.getAge()).isEqualTo(3);
        assertThat(gorilla_2.getName()).isEqualTo("Gorilla");
    }

}