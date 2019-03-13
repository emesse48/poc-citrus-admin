package com.citrus.assemblage.citrus_auto2;

import org.testng.annotations.Test;

import com.citrus.modules.*;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;

@Test
public class TestSuite2 extends TestNGCitrusTestRunner{
	
	@Test
    @CitrusTest
    public void Print(){    	
    	System.out.println("Test Suite 2 Run");
    }
}
