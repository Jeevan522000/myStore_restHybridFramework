package api.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endPoints.storeEndPoints;
import api.payload.storePayload;
import io.restassured.response.Response;



public class store_TC
{
	Faker faker;
	storePayload spl;
	
	@BeforeClass
	public void createTestData()
	{
		faker = new Faker();
		spl = new storePayload();
		
		spl.setOrderId("1");
		spl.setId(faker.idNumber().hashCode());
		spl.setPetID(faker.idNumber().hashCode());
		spl.setQuantity(faker.idNumber().hashCode());
		spl.setShipDate(faker.date().hashCode());
		spl.setStatus(faker.name().suffix().concat(" : placed"));
		spl.setComplete(true);
	}
	
	@Test(priority = 1)
	public void createOrder()
	{
		Response response = storeEndPoints.createOrder(spl);
		
		//log
		response.then().log().all();
		
		//verification
		Assert.assertEquals(spl.getComplete(), true);
		
	}
	
	@Test(priority = 2)
	public void getOrder()
	{
		Response response = storeEndPoints.getOrder(spl.getOrderId());
		
		//log
		response.then().log().all();
		
		//verification
		Assert.assertEquals(spl.getComplete(), true);
		
	}
	
	@Test(priority = 3)
	public void deleteOrder()
	{
		Response response = storeEndPoints.deleteOrder(spl.getOrderId());
		
		//log
		response.then().log().all();
		
		//verification
		Assert.assertEquals(spl.getComplete(), true);
		
	}
}
