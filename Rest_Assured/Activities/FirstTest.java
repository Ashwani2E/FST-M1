package examples;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;


public class FirstTest {
    //set the Base URI
    String baseURI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void getRequestWithQueryParam() {
        //send the request and save the response
        Response response =
                given().header("ContentType", "application/json").queryParam("status" , "sold").
                 when().get(baseURI + "/findByStatus");

        //Print the response
        System.out.println(response.getBody().asString());
        System.out.println(response.getBody().asPrettyString());
        System.out.println(response.getHeaders().asList());
        //System.out.println(response.getHeader("Server"));

        // Extraction
        String petName = response.then().extract().body().path("[0]['name']");
        System.out.println(petName);

        //Assertions
        Assert.assertEquals(petName, "null");
        Assert.assertEquals(response.getStatusCode(),200);
        response.then().statusCode(200).body("[0].name", equalTo("null"));
    }

    @Test
    public void getRequestWithPathParam() {
        //send the request, get the response, assert and print request and response
        //https://petstore.swagger.io/v2/pet/{petId}
        given().header("ContentType", "application/json").pathParam("petId", 12).log().all().
         when().get(baseURI + "/{petId}").
         //then().statusCode(200).body("name", equalTo("doggie")).body("status", equalTo("available"));
        //then().statusCode(200).body("name", equalTo("doggie")).log().all();
                then().statusCode(200).body("name", equalTo("doggie")).log().ifStatusCodeMatches(greaterThanOrEqualTo(400));

    }
}
