package com.citrus.assemblage.citrus_auto;

import org.testng.annotations.Test;

import com.citrus.modules.*;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;

@Test
public class TestSuiteIT extends TestNGCitrusTestRunner{

	@Test
    @CitrusTest
    public void Print(){    	
    	System.out.println("Test Suite 1 Run.");
    	
    }
}
