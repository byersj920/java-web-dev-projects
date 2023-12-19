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
    public void basicLaunchCodeIsTrue(){
        assertTrue(hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void codeBracketedIsTrue(){
        assertTrue(hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void preLaunchCodeBracketsIsTrue(){
        assertTrue(hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void isEmptyIsTrue(){
        assertTrue(hasBalancedBrackets(""));
    }

    @Test
    public void simpleBracketsIsTrue(){
        assertTrue(hasBalancedBrackets("[]"));
    }

    @Test
    public void missingOneRightIsFalse(){
        assertFalse(hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void swappedCodeBracketsIsFalse(){
        assertFalse(hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void singleBracketIsFalse(){
        assertFalse(hasBalancedBrackets("["));
    }

    @Test
    public void correctCurlyIsTrue(){
        assertTrue(hasBalancedBrackets("{LaunchCode}"));
    }

    @Test
    public void wrongCurlyIsFalse(){
        assertFalse(hasBalancedBrackets("}{"));
    }

    @Test
    public void correctParenthesesIsTrue(){
        assertTrue(hasBalancedBrackets("(LaunchCode)"));
    }

    @Test
    public void wrongParenthesesIsFalse(){
        assertFalse(hasBalancedBrackets(")("));
    }

    @Test
    public void wrongMixAndMatchingIsFalse(){
        assertFalse(hasBalancedBrackets("{)"));
    }

    @Test
    public void correctMixAndMatchingIsTrue(){
        assertTrue(hasBalancedBrackets("{Launch(Code) Baybee}"));
    }

    @Test
    public void mixedBag(){
        assertFalse(hasBalancedBrackets("[[{]}]"));
    }
}