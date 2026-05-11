package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public void testApp()
    {
	App app=new App();
	int result=app.add(2,3);
        System.out.println("Running test:2+3="+result);
	assertEquals(5,result);
    }
}
