package com.example.chilemod1;

import org.junit.Test;

import java.io.File;

public class DemoAppTests {

    @Test
    public void verifyTestFile() {
        assert new File("test-classes/test.txt").exists();
    }

    @Test
    public void verifyTestMainFile() {
        assert new File("test-main.txt").exists();
    }
}
