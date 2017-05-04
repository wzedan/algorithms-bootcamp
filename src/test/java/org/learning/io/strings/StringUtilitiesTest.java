package org.learning.io.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wz on 4/29/17.
 */
public class StringUtilitiesTest {
    @Test
    public void isUnique() throws Exception {
        String test1 = "abc#12";

        assertTrue(StringUtilities.isUnique(test1));

        String test2 = "abbc";

        assertFalse(StringUtilities.isUnique(test2));
    }

    @Test
    public void isPermutation() {
        assertTrue(StringUtilities.isPermutation("abc", "cba"));

        assertTrue(StringUtilities.isPermutation("ABC", "cba"));

        assertTrue(StringUtilities.isPermutation("abc", "CBA"));

        assertFalse(StringUtilities.isPermutation("abc", "dBA"));

    }

    @Test
    public void replaceSpace() {
        String out = StringUtilities.replaceSpace("Mr Waleed Zedan      ", 14);
        System.out.println(out);
    }

    @Test
    public void isEditOne() {
        assertTrue(StringUtilities.isOneWayEdited("pale", "ple"));
        assertTrue(StringUtilities.isOneWayEdited("pales", "pale"));
        assertTrue(StringUtilities.isOneWayEdited("pale", "bale"));
        assertFalse(StringUtilities.isOneWayEdited("pale", "bake"));
    }
}