package test;
import java.util.Arrays;
import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Before

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoSetsOfClosedBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void nonClosedBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


    @Test
    public void closedBracketsWithWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void unbalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]["));
    }

    @Test
    public void unbalancedBracketsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode][]]"));
    }

    @Test
    public void emptyStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void nestedBalancedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void nonClosingBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][]"));
    }



}
