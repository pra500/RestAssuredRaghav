package alwayspracticehere;

import org.testng.annotations.Test;

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

public class GetrrrrrTest {

	@Test
	public void fTest() {

		given().when().get("https://jsonplaceholder.typicode.com/comments").then().statusCode(200).and()
				.body("[0].id", equalTo(1)).and().body("[1].id", equalTo(2)).and()
				.body("[9].email", equalTo("Carmen_Keeling@caroline.name")).and()
				.body("[4].name", equalTo("vero eaque aliquid doloribus et culpa"));

	}

	@Test
	public void feTest() {

		given().when().get("https://jsonplaceholder.typicode.com/comments/2").then().statusCode(200).and()
//				.body("[0].id", equalTo(1)).and().body("[1].id", equalTo(2)).and()
//				.body("[9].email", equalTo("Carmen_Keeling@caroline.name")).and()
				.body("postId", equalTo(1));

	}
	@Test
	public void fddddTest() {

		given().when().get("https://jsonplaceholder.typicode.com/comments/4").then().statusCode(200).and()
				.body("email", equalTo("Lew@alysha.tv")).and().body("body", equalTo("non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati"));		
	}
	
	
	@Test
	public void fddddeTest() {

		
		given().headers("Content-Type", "application/json").when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200);
				
		
		
	}
}