package Chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


class Chapter1Test {
    Chapter1 chapter1;
    @BeforeEach
    void setUp(){
        chapter1 = new Chapter1();
    }


    @Test
    @DisplayName("Checks if string has all unique characters")
    void isUnique() {
        assertTrue("Returns true for 'cat'", chapter1.isUnique("cat"));
        assertFalse("Returns true for 'aaa'", chapter1.isUnique("aaa"));
        assertTrue("Returns true for blank string", chapter1.isUnique(""));
    }

    @Test
    @DisplayName("Given two strings check to see if one is a permutation of another")
    void isPermutaton(){
        assertTrue("returns true for 'a' and 'a'", chapter1.isPermutation("a", "a"));
        assertFalse("returns false for 'ab' and 'bbb'", chapter1.isPermutation("ab", "bbb"));
        assertFalse("returns false for 'abc' and 'cac'", chapter1.isPermutation("abc", "cac"));

    }


    @Test
    void URLify() {
        assertEquals(chapter1.URLify("Mr John Smith"), "Mr%20John%20Smith");
        assertEquals(chapter1.URLify("Mr JohnSmith "), "Mr%20JohnSmith");
        assertEquals(chapter1.URLify(" "), "");
    }

    @Test
    void palindromePermutation() {
        assertTrue("returns true for 'tacocat'", chapter1.palindromePermutation("tacocat"));
        assertFalse("returns false for 'tacoct'", chapter1.palindromePermutation("tacoat"));

    }

    @Test
    void editsAway() {
        assertTrue("returns true 'bale' and 'ble'", chapter1.editsAway("bale", "ble"));
        assertFalse("returns false 'bale' and 'boole'", chapter1.editsAway("bale", "boole"));
    }

    @Test
    void stringCompression() {
        assertEquals(chapter1.stringCompression("aaabbb"), "a3b3");
        assertEquals(chapter1.stringCompression("bb"), "bb");

    }
}