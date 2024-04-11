package tests;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest {
	
	
	
	
	
	//get 
  @Test
  public void getTest() {
	  
//	  Response res=RestAssured.get("https://reqres.in/api/users?page=2");
//	  
//	  
//	 System.out.println(res.getStatusCode());
//	 System.out.println(res.getTime());
//	 
//	 System.out.println( res.getBody().asString());
//System.out.println(res.getStatusLine());
//
//System.out.println(res.getHeaders());
//	 
	
	  
	
	/*  
	  Response res=RestAssured.get("https://reqres.in/api/users/2");	 
	  System.out.println( res.getStatusCode());	 
	  System.out.println(res.getBody().asString());	  
	  System.out.println(res.getTime());*/
	  
//	 Response res=RestAssured.get("https://reqres.in/api/unknown/2");
//	 
//	 String s=res.getBody().asString();
//	 System.out.println(s);
//	 
//	 
//	 int code=res.getStatusCode();
//	 System.out.println(code);
	

	  
  }
  
  
  
  
  
  
  
  @Test
  public void pTest() {
	  
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  System.out.println(res.getBody().asString());
	  
	  
	  
	  System.out.println(res.getStatusCode());
	  System.out.println(res.getBody().asString());	
	  System.out.println(res.contentType());
	  
	  
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,  200);
	  	  	  
	  
	  
}
  
  
  
 
  
  
  
  //put
  @Test
  public void postiTest() {
	  
		/*
		 * JSONObject jo=new JSONObject(); jo.put("first_name", "Parag");
		 * jo.put("last_name", "Sharma");
		 * 
		 */
	  
	  
	  
	  
	  
	  
}
  
  
  
}
