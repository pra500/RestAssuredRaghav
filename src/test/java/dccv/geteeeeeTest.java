package dccv;

import org.testng.annotations.Test;

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


import java.util.Map;
import org.hamcrest.Matchers;






public class geteeeeeTest {
  @Test
  public void getTest() {
	  
	  given().when().get("https://jsonplaceholder.typicode.com/comments?id=3").then().assertThat().body("name", equalTo("odio adipisci rerum aut animi"));
	  given().when().get("https://jsonplaceholder.typicode.com/comments?id=3").then().assertThat().body("name", Matchers.hasItem("")
  
			  
			  //"find {it.id == 346}.personDependencies.name", hasItems("json", "jackson"));

  }
}
