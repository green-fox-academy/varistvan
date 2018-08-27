import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void StringTest() {
        Anagram testerStrings = new Anagram("abc", "cba");
        assertTrue(testerStrings.checkIfIsAnagram());
    }

    @Test
    public void NewStringsTest() {
        Anagram testerStrings = new Anagram("listen", "sillllent");
        assertFalse(testerStrings.checkIfIsAnagram());
    }

    @Test
    public void VeryBadStringsTest() {
        Anagram testWordsVeryBad = new Anagram("listen", "llllll");
        assertFalse(testWordsVeryBad.checkIfIsAnagram());
    }

    @Test
    public void AnotherTestForCheckingIfTheTwoGivenWordsAreAnagrams() {
        Anagram twoWords = new Anagram("klasszik", "szkasikl");
        assertTrue(twoWords.checkIfIsAnagram());
    }

}