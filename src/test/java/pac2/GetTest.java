package pac2;

import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class GetTest {
		
	
  @Test(priority = 0)
  public void fiTest() {
	    
	  
	  //Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  Response res=get("https://reqres.in/api/users?page=2");
	  System.out.println(res.asString());
	  
	
	 System.out.println(res.getStatusCode());
	 System.out.println(res.getContentType());
	 System.out.println(res.getBody().asString());
	 
	 System.out.println(res.getHeader("content-type"));
	 System.out.println(res.getTime());	 
	 
	 
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,  200);
	  
  }
  
  
	
  @Test(priority = 1)
  public void fiiTest() {
	  
	  
	 Response rs=delete("https://reqres.in/api/users/2");
	 rs.getStatusCode();
	 
	 
	  int code=rs.getStatusCode();
	  Assert.assertEquals(code,  20334);
	  
	 
	 
	  
  }
  

	
  @Test(priority = 2)
  public void fiiiTest() {
	  
	  
	 Response rs=delete("https://reqres.in/api/users/2");
	 rs.getStatusCode();
	 
	 
	  int code=rs.getStatusCode();
	  Assert.assertEquals(code,  204);
	  
	 
	 
	  
  }
  
	
  @Test(priority = 1)
  public void fiiiiTest() {
	  
	  
	 //Response rs=get("https://reqres.in/api/users?page=2").then().body("dat"), null)
	  
	 //browsing closing
	 
	  
  }
  
  
  
  
	
  //@Test
  public void sTest() {
	  
	Response res=get("https://gorest.co.in/public/v2/users/2139332/posts");
	System.out.println(res.asString());
	  
	res.getHeaders();
	res.getStatusCode();
	res.getStatusLine();
	res.getTime();
	res.getSessionId(); 
	
  
  }
  
	
  @Test
  public void s1Test() {
	  
	Response res=get("https://gorest.co.in/public/v2/users/2139332/todos");
	  System.out.println(res.asString());
	  
	res.getHeaders();
	res.getStatusCode();
	res.getStatusLine();
	res.getTime();
	res.getSessionId(); 
	
  
  }
  
	
  //@Test
  public void showTest() {
	  
	Response res=get("https://gorest.co.in/public/v2/users/2139332/posts");
	  System.out.println(res.asString());
	  
	res.getHeaders();
	res.getStatusCode();
	res.getStatusLine();
	res.getTime();
	res.getSessionId(); 
	
  
  }
	
  //@Test
  public void s2Test() {
	  
	Response res=get("https://gorest.co.in/public/v2/users/2139332/posts");
	  System.out.println(res.asString());
	  
	res.getHeaders();
	res.getStatusCode();
	res.getStatusLine();
	res.getTime();
	res.getSessionId(); 
	
  
  }
	
 // @Test
  public void s3Test() {
	  
	Response res=get("https://gorest.co.in/public/v2/users/2139332/posts");
	  System.out.println(res.asString());
	  
	res.getHeaders();
	res.getStatusCode();
	res.getStatusLine();
	res.getTime();
	res.getSessionId(); 
	
  
  }
	
  //@Test
  public void s4Test() {
	  
	Response res=get("https://gorest.co.in/public/v2/users/2139332/posts");
	  System.out.println(res.asString());
	  
	res.getHeaders();
	res.getStatusCode();
	res.getStatusLine();
	res.getTime();
	res.getSessionId(); 
	
  
  }
  
  
  @Test
	public void getTest()
	{
		
		
		Response res=get("https://restful-booker.herokuapp.com/booking");
		System.out.println(res.asString());
		  
		res.getHeaders();
		res.getStatusCode();
		res.getStatusLine();
		res.getTime();
		res.getSessionId(); 
		
			
		
	}

	
	@Test
	public void getuTest()
	{
		
		
		Response res=get("https://restful-booker.herokuapp.com/booking");
		System.out.println(res.asString());
		  
		res.getHeaders();
		res.getStatusCode();
		res.getStatusLine();
		res.getTime();
		res.getSessionId(); 
		
			
		
	}


 
}
