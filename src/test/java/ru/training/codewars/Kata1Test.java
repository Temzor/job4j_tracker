package ru.training.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Kata1Test {

    @Test
    public void testEncrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Kata1.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", Kata1.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", Kata1.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", Kata1.encrypt("This is a test!", 3));
        assertEquals("This is a test!", Kata1.encrypt("This is a test!", 4));
        assertEquals("This is a test!", Kata1.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig",
                Kata1.encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Kata1.decrypt("This is a test!", 0));
        assertEquals("This is a test!", Kata1.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", Kata1.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", Kata1.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", Kata1.decrypt("This is a test!", 4));
        assertEquals("This is a test!", Kata1.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!",
                Kata1.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        // assertEquals("expected", "actual");
        assertEquals("", Kata1.encrypt("", 0));
        assertEquals("", Kata1.decrypt("", 0));
        assertNull(Kata1.encrypt(null, 0));
        assertNull(Kata1.decrypt(null, 0));
    }

}