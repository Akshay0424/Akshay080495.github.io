package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassMarksTest {

    private ClassMarks studentEvaluation = new ClassMarks();

    @Test
    public void average() {

        String expected = "Average is 70";
        int[] grades = {50, 60, 90, 80};
        String actual = studentEvaluation.average(grades);
        assertEquals(expected, actual);
    }

    @Test
    public void minimum() {

        String expected = "Minimum is 45";
        int[] grades = {45, 65, 68, 87};
        String actual = studentEvaluation.minimum(grades);
        assertEquals(expected, actual);
    }

    @Test
    public void maximum() {

        String expected = "Maximum is 99s";
        int[] grades = {66, 85, 78, 99};
        String actual = studentEvaluation.maximum(grades);
        assertEquals(expected, actual);
    }
}