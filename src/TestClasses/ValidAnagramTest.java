package TestClasses;

import org.junit.Test;

import static ProdClasses.ValidAnagram.compareWords;
import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void compareWords1True() {
        String s = "heart";
        String t = "earth";

        assertTrue(compareWords(s,t));
    }

    @Test
    public void compareWords2False() {
        String s = "hear";
        String t = "earth";

        assertFalse(compareWords(s,t));
    }

    @Test
    public void compareWords3True() {
        String s = "spear";
        String t = "pears";

        assertTrue(compareWords(s,t));
    }
}