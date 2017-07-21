package com.lrs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
    	App app = App.getInstance();
        
        assertNotNull(app);

        app.coverageTestMethod("ok");
    }
}
