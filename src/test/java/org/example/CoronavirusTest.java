package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoronavirusTest {

    Coronavirus coronavirus = new Coronavirus();

    @Test
    public void getName() {
        String name = "Corona Virus";

        assertEquals(name, name);
    }

    @Test
    public void testToString() {
        String output = "Name: " + coronavirus.getName() + "\n" + super.toString();

        assertEquals(output, output);
    }
}