package d222;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import org.testng.annotations.Test;

import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


public class New222Test {
	
	
	/*
	{
    "name": "morpheus",
    "job": "leader"
}
  */
  
  
  @Test
  public void fTest() {
	  
	 JSONObject jo=new  JSONObject();	 
	 jo.put("name", "pgg");
	 jo.put("job", "devopssss");
	 
	 given().body(jo.toString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	 
	 
	 
  }
}
