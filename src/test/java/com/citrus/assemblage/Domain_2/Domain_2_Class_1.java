package com.citrus.assemblage.citrus_auto;

import org.testng.annotations.Test;

import com.citrus.modules.*;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestDesigner;

@Test
public class Domain_2_Class_1 extends TestNGCitrusTestDesigner{    
	
	@Test
    @CitrusTest
    public void D2C1_Method(){
    	System.out.println("D2C1_Method Run.");
    }	

}
