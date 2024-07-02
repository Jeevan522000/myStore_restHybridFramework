package api.endPoints;

import api.payload.userPayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
 

public class userEndPoints {
	
	public static Response createUser(userPayload upayload)
	{
		Response response= given()
		.accept(ContentType.JSON)         //what kind of data accepting as request
		.contentType(ContentType.JSON)    //what type of content sending as request
		.body(upayload)
		
		.when()
		.post(routes.post_user);
		
		return response;
		
	}
	
	public static Response getUser(String get_user)
	{
		Response response=  given()
		.accept(ContentType.JSON)         //what kind of data accepting as request
        .pathParam("username", get_user)
		
		
		.when()
		.get(routes.get_user);
		
		return response;
		
	}
	
	public static Response updateUser(String user_update, userPayload upayload_put)
	{
		Response response= given()
		.accept(ContentType.JSON)         //what kind of data accepting as request
		.contentType(ContentType.JSON)    //what type of content sending as request
        .pathParam("username", user_update)
        .body(upayload_put)
		
		
		.when()
		.put(routes.put_user);
		
		return response;
	}
	
	public static Response deleteUser(String user_delete)
	{
		Response response= (Response) given()
		.accept(ContentType.JSON)         //what kind of data accepting as request
        .pathParam("username", user_delete)
		
		
		.when()
		.delete(routes.delete_user);
		
		return response;
		
	}

}
