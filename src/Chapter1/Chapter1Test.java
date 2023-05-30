package Chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


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
}