package api.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endPoints.userEndPoints;
import api.payload.userPayload;
import io.restassured.response.Response;

public class user_TC 
{
	Faker faker;
	userPayload upl;

	@BeforeClass
	public void generateTestData()
	{
		faker = new Faker();
		upl = new userPayload();

		upl.setId(faker.idNumber().hashCode());
		upl.setUsername(faker.name().username());
		upl.setFirstName(faker.name().firstName());
		upl.setLastName(faker.name().lastName());
		upl.setEmail(faker.internet().emailAddress());
		upl.setPassword(faker.internet().password());
		upl.setPhone(faker.phoneNumber().phoneNumber());
	}

	@Test(priority = 1)
	public void create_user()
	{
		Response response =userEndPoints.createUser(upl);

		//log response
		response.then().log().all();

		//validation
		Assert.assertEquals(response.getStatusCode(), 200);	
	}

	@Test(priority = 2)
	public void getUser()
	{
		Response response=userEndPoints.getUser(this.upl.getUsername());

		//log response
		response.then().log().all();

		//validation
		Assert.assertEquals(response.getStatusCode(), 200);	
	}
	
	@Test(priority = 3)
	public void updateUser()
	{
		upl.setFirstName(faker.name().firstName());
		Response response=userEndPoints.updateUser(this.upl.getUsername(),upl);

		//log response
		response.then().log().all();

		//validation
		Assert.assertEquals(response.getStatusCode(), 200);	
	}
	
	@Test(priority = 4)
	public void deleteUser()
	{
		Response response=userEndPoints.deleteUser(this.upl.getUsername());

		//log response
		response.then().log().all();

		//validation
		Assert.assertEquals(response.getStatusCode(), 200);	
	}
}
