package com.yassine.course.chapter5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WolfTest {


    @Test
    public void child_overriding_method_should_return_value_of_parent_method_plus_offset() {

        Canine canine = new Canine();
        Wolf wolf = new Wolf();

        assertThat(wolf.getAverageWeight()).isEqualTo(canine.getAverageWeight() + 20);

    }
}