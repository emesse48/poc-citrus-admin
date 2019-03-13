package com.citrus.assemblage.citrus_auto;

import org.testng.annotations.Test;

import com.citrus.modules.*;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestDesigner;

@Test
public class SuiteTest extends TestNGCitrusTestDesigner{    
	
	@Test
    @CitrusTest
    public void REST_GET(){    	
    	System.out.println("Suite 1 Run.");
    }	

}
