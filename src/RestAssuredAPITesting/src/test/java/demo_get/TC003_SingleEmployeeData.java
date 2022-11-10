package demo_get;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_SingleEmployeeData {

    @Test
    void getSingleEmployeeDetails()
    {
        //base URI
        RestAssured.baseURI = "https://dummy.restapiexample.com";

        //Request object
        RequestSpecification httpRequest = RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET,"/api/v1/employee/9");

        //print response
        String responseBody = response.getBody().asString();
        System.out.println("Response body is " +responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is " +statusCode);
        Assert.assertEquals(statusCode, 200);

        //Header validation
        String ContentType = response.header("Content-Type"); //content type validation
        System.out.println("Content-Type is " +ContentType);
        Assert.assertEquals(ContentType, "application/json");

        //Success response validation
        String status = response.jsonPath().get("status");
        System.out.println("Status is " +status);
        Assert.assertEquals(status,"success");

    }
}