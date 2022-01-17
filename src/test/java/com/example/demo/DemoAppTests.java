package com.example.demo;

import org.junit.Test;

import java.io.File;

public class DemoAppTests {

    @Test
    public void verifyFile() {
        assert new File("test-classes/test.txt").exists();
    }
}
