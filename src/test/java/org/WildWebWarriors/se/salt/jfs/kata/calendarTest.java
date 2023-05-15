package org.WildWebWarriors.se.salt.jfs.kata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class calendarTest {
    @Test
    void fallShouldContainDecember () {
        SaltCourse fallCourse= new SaltCourse(CoursePeriod.FALL);
        assertTrue(Arrays.asList(fallCourse.getMonths()).contains("December"));
    }

    @Test
    void summerShouldHaveLength3 () {
        SaltCourse summerCourse = new SaltCourse(CoursePeriod.SUMMER);
        assertEquals(3, summerCourse.getMonths().length);
    }
}