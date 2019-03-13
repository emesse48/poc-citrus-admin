package com.citrus.assemblage.citrus_auto2;

import org.testng.annotations.Test;

import com.citrus.modules.*;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestDesigner;

@Test
public class Suite2 extends TestNGCitrusTestDesigner{
	
	@Test
    @CitrusTest
    public void Print(){    	
    	System.out.println("Suite 2 Run");    	
    }

}
