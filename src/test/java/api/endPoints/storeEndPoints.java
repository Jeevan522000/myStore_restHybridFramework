package api.endPoints;

import api.payload.storePayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class storeEndPoints 
{
	public static Response createOrder(storePayload spayLoad)
	{
		 Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(spayLoad)

		.when()
		.post(routes.post_order);
		
		return response;
	}
	
	public static Response getOrder(String orderid)
	{
		 Response response = given()
		.accept(ContentType.JSON)
		.pathParam("orderID", orderid)

		.when()
		.get(routes.get_order);
		
		return response;
	}
	
	public static Response deleteOrder(String order_id)
	{
		 Response response = given()
		.accept(ContentType.JSON)
		.pathParam("orderID",order_id)

		.when()
		.delete(routes.delete_order);
		
		return response;
	}
}
