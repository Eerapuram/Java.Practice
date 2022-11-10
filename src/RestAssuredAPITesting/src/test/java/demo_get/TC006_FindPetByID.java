package demo_get;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC006_FindPetByID {

    @Test
    void getPetDetailsUsingID()
    {
        //base URI
        RestAssured.baseURI = "https://petstore.swagger.io";

        //Request object
        RequestSpecification httpRequest = RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET,"/v2/pet/6");

        //print response
        String responseBody = response.getBody().asString();
        System.out.println("Response body is " +responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is " +statusCode);
        Assert.assertEquals(statusCode, 200);

        //Sold response validation
        String status = response.jsonPath().get("status");
        System.out.println("Status is " +status);
        Assert.assertEquals(status,"string");

    }
}
