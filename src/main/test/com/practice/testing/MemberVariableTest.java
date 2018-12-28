package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable memberVariable = new MemberVariable();
    Member member = new Member();

    @Test
    public void getName() {

        String expectedValue = "Akshay";
        member.setName("Akshay");
        assertEquals(expectedValue, memberVariable.getName(member));
    }

    @Test
    public void getAge() {

        int expectedValue = 23;
        member.setAge(23);
        assertEquals(expectedValue, memberVariable.getAge(member));
    }

    @Test
    public void getSalary() {

        double expectedValue = 51000.0;
        member.setSalary(51000.0);
        assertEquals(expectedValue, memberVariable.getSalary(member),0.0001);
    }
}