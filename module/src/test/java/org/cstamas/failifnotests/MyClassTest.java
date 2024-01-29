package org.cstamas.failifnotests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    @Test
    public void smoke() {
        assertEquals("hello", new MyClass().hello());
    }
}
