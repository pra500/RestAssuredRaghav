package alwayspracticehere;

import org.hamcrest.core.IsNull;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;




public class putttt1Test {
	
	
	// https://reqres.in/api/users/2
	
	/*
	 * {
    "name": "morpheus",
    "job": "zion resident"
}
	 */
	
	
  @Test
  public void fTest() {
	 given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);
	  
  }
}
