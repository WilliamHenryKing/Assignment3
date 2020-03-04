package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class VirusTest {

    Virus virus = new Virus();

    @Test
    public void getInfectivity() {
        int result = virus.getInfectivity();

        assertEquals(result, result);
    }

    @Test
    public void setInfectivity() {
        int testNUm = 6;
        virus.setInfectivity(testNUm);
        assertEquals(testNUm, testNUm);
    }

    @Test
    public void getPopulationInfected_plusKilled() {
        long result1 = virus.getPopulationInfected();
        assertEquals(result1, result1);

        long result2 = virus.getPopulationKilled();
        assertEquals(result2, result2);
    }
}