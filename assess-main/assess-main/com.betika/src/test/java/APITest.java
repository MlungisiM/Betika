import common.DriverHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class APITest extends DriverHandler {
    String url = getProp().getProperty("api.url");

    @org.testng.annotations.Test
    public void BetikaAPI() throws JsonProcessingException {

        Response response = (Response) RestAssured.given().
                contentType(ContentType.JSON).
                log().all().
                when().
                get(url)
                .then().log().all().assertThat().statusCode(200)
                .body("size()", Matchers.is(10))
                .body("userName", Matchers.hasItem("User 6"))
                .extract().response();

        JsonNode jsonResponse = new ObjectMapper().readTree(response.getBody().asString());
        int numObjects = jsonResponse.size();
        System.out.println("Number of objects: " + numObjects);
    }
}
