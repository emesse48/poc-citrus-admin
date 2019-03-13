package com.citrus.modules;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

@Test
public class RestAssuredGet{	
	
    public static void GET() {    	
		

		//REST ASSURED PARAMETERS
        baseURI = "http://benito-service";
        basePath = "/";
        
        //REST ASSURED METHOD
        Response Resp = RestAssured.given()
		.request(Method.GET, "/")
		.then()		
		.extract()
		.response();

        int test = Resp.getStatusCode();     
        
        //Pretty Print JSON
        String responseBody = Resp.getBody().asString();        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement jsonElement =  new JsonParser().parse(responseBody);

    	System.out.println(" ");
        System.out.println(" ");
		System.out.println("============= REST ASSURED DEBUG : METHOD = GET =============");
    	System.out.println(" ");
        System.out.println(" ");
        System.out.println("Response Body:");
        System.out.println(" ");
        System.out.println(gson.toJson(jsonElement));
		System.out.println(" ");
        System.out.println("Status Code: " + test);        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("============= REST ASSURED DEBUG END =============");
    	System.out.println(" ");
        System.out.println(" ");

    }
}

