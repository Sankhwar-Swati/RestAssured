package New_package;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class third_class {
	
	@Test
	public void test_put() {
		

		JSONObject request= new JSONObject();
		request.put("name", "Swati");
		request.put("age", 22);
		
		System.out.println(request.toJSONString());
		
		baseURI= "https://reqres.in/api";
		given().
		    header("content-Type","application/json").
		     contentType(ContentType.JSON).
		     accept(ContentType.JSON).
		    body(request.toJSONString()).
		when().
		    put("/users/2").
		then().
		     statusCode(200).log().all();
		
		

	}
	@Test
	public void test_patch() {
		
		JSONObject request= new JSONObject();
		request.put("name", "Nimrat");
		request.put("age", 25);
		
		System.out.println(request.toJSONString());
		
		baseURI= "https://reqres.in/api";
		given().
		    header("content-Type","application/json").
		     contentType(ContentType.JSON).
		     accept(ContentType.JSON).
		    body(request.toJSONString()).
		when().
		    patch("/users/3").
		then().
		     statusCode(200).log().all();
		
    }
	
	@Test
	public void test_Delete() {
		
		baseURI= "https://reqres.in/api";
		
		when().
		     delete("/api/uses/3").
		then().
		      statusCode(204).log().all();
	
				
		
		
}}