package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.launchcode.BalancedBrackets.hasBalancedBrackets;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void checkDefaultCorrectString(){
        assertTrue(hasBalancedBrackets("[This should work!]"));
    }

    @Test
    public void checkBackwardsBrackets(){
        assertFalse(hasBalancedBrackets("]["));
    }

    @Test
    public void
}