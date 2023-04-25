package com.example.calculadora;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainActivityTest extends TestCase {

    private MainActivity mainActivity;
    @Before
    public void SetUp(){
        mainActivity = new MainActivity();
    }
    @After
    public void tearDown(){
        mainActivity = null;
    }

    @Test
    public void testSumar() {
        int resultado = mainActivity.sumarBtn(2,3);
        assertEquals(5, resultado);
    }
    @Test
    public void testRestar() {
        int resultado = mainActivity.restarBtn(3,2);
        assertEquals(1, resultado);
    }
}